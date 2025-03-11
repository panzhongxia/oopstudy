package myHashMap;

public class
MyHashMap<K, V> implements MyMap<K, V>{

    private Entry<K, V> table[] = null;
    private int size;
    private static int defaultLength = 16;
    private static double defaultLoad = 0.75;


    @Override
    public V put(K k, V v) {
        if (table == null) {
            table = new Entry[this.defaultLength];
        }

        if(size >= this.defaultLength*this.defaultLoad){
            reSize();
        }

        int index = getIndex(k, this.defaultLength);

        MyMap.Entry<K, V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(k)){
                return entry.setValue(v);
            }else {
                entry = entry.getNext();
            }
        }

        //hash冲突，下标位置原本的值，变成了next值
        table[index] = new Entry<>(k,v,table[index]);
        this.size ++;
        return v;
    }

    private int getIndex(K k, int length) {
        if (k == null) {
            return 0;
        }
        int hash = k.hashCode();
//        System.out.println(hash);

        return hash & (length - 1);
    }

//    public static void main(String[] args) {
//        new MyHashMap<Integer,String>().getIndex(1);
//        new MyHashMap<Integer,String>().getIndex(1);
//    }

    private void reSize() {
        if(size >= this.defaultLength*this.defaultLoad){
             Entry<K, V> newTable[] = new Entry[this.defaultLength << 1];
             MyMap.Entry<K, V> entry = null;
             for(int i=0; i < table.length; i++){
                 entry=table[i];
                 while (entry != null){
                     int index = getIndex(entry.getKey(), newTable.length);
                     MyMap.Entry<K, V> oldEntry = entry.getNext();
                     entry.setNext(newTable[index]);
                     newTable[index] = (Entry<K, V>) entry;
                     entry = oldEntry;
                 }
             }
             table = newTable;
             this.defaultLength = newTable.length;
             newTable = null;
        }
    }

    @Override
    public V get(K k) {
        if(table != null){
            int index = getIndex(k, this.defaultLength);
            MyMap.Entry<K, V> entry = table[index];
            while (entry != null) {
                if(entry.getKey().equals(k)){
                    return entry.getValue();
                }else{
                    entry = entry.getNext();
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    static class Entry<K, V> implements MyMap.Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }


        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public MyMap.Entry<K, V> getNext() {
            return this.next;
        }

        @Override
        public MyMap.Entry<K, V> setNext(MyMap.Entry<K, V> next) {
            MyMap.Entry<K, V> oldNext = this.next;
            this.next = (Entry<K, V>) next;
            return oldNext;
        }
    }
}
