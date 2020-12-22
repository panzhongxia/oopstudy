package day02;

public class Test {
    public static void main(String[] args) {
        Cashier c = new Cashier();
        c.pay(400);
        c.pay("0000 1010 6734 33434", "123456");

        //Girl gf=new Girl();
        Girl gf = new Girl("三室两厅", "奥迪Q7", 100000);
        gf.printInfo();
        Girl gf1 = new Girl("三室两厅", 100000);
        gf1.printInfo();
        Girl gf2 = new Girl();
        gf2.printInfo();

        Character[] chs = new Character[6];
        chs[0] = new Character("哀木撒", 8726, 43, '低');
        chs[1] = new Character("萨满", 4710, 43, '高');
        chs[2] = new Character("呆贼", 2343, 32, '高');
        chs[3] = new Character("猎人", 3660, 35, '中');
        chs[4] = new Character("慕斯", 7291, 60, '低');
        chs[5] = new Character();

        for(int i= 0;i<chs.length; i++){
            chs[i].prinfinfo();
        }

//        char[] box1 = new char[]{'蛋','蛋','蛋','蛋','蛋'};
//        char[] box2 = new char[]{'蛋','蛋','蛋','蛋','蛋'};
//        char[] box3 = new char[]{'蛋','蛋','蛋','蛋','蛋'};
//
//        char[][] rack = new char[][]{box1,box2,box3};

        char[][] rack = new char[3][];
        rack[0] = new char[]{'蛋','蛋'};
        rack[1] = new char[]{'蛋','蛋','蛋','蛋','蛋','蛋'};


        for(int i = 0; i < rack.length; i++){
            if(rack[i]!=null){
                for (int j = 0; j < rack[i].length; j++) {
                    System.out.print(rack[i][j]+",");
                }
            }

            System.out.println();
        }
    }
}
