public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){};

    public static Singleton getSingleton() {
        if(singleton == null){
            //lock
            if(singleton == null){
                singleton = new Singleton();
            }
            //unlock
        }
        return singleton;
    }
}
