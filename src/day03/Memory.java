package day03;

public class Memory {
    public static void main(String[] args){
//        double card = 10;
//        char lp = buy('鱼',card);
//        System.out.println("card中的余额："+card);

        Card lpCard = new Card("lp",10);
        char lp = buy('鱼',lpCard);
        System.out.println("饭卡的余额："+lpCard.bal);
        char[] my = new char[]{'包','包','包','包','包'};
        char[] gf = new char[] {'烧','烧','烧','烧','烧'};
        for (int i = 0; i < my.length; i++){
            my[i] = 0;
        }
        System.out.println(my);

        gf[0] = 0;
        gf[1] = 0;
        System.out.println(gf);

        my = gf;

        my[2] = 0;
        my[3] = 0;
        System.out.println(gf);

        gf[4] = 0;
        gf = null;
        my = null;
//        System.out.println(gf);
        showMen();
        for (int i = 0; i < 200; i++) {
            char[] chs = new char[2000*1024*1024/2];
            chs = null;
            System.gc();
        }

//        char[] chs = new char[10*1024*1024/2];
//        chs = null;
//        System.gc();
        showMen();
    }

    public static char buy(char what,Card card){
        card.bal -= 3;
        System.out.println("余额："+card.bal);
        return what;
    }

    public static char buy(char what,double card) {
        card -= 3;
        System.out.println("余额："+ card);
        return what;
    }

    public static void showMen() {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Max:"+rt.maxMemory()/1024/1024+"M;"
                           +"Total:"+rt.totalMemory()/1024/1024+"M;"
                           +"Free:"+rt.freeMemory()/1024/1024+"M");

    }

}
