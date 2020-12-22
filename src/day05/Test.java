package day05;

import day04.Shop;

public class Test {
    public static void main(String[] args){
//        Shop s= new Shop();
//        s.sale(100,10);
        SubShop ss = new SubShop();
        ss.sale(100,10);

//        Father f = new Father(); //编译错误：切记！抽象类不可以实例化
        //因为抽象类都是不完整的！
        //要想使用抽象类中的普通方法，只能通过子类对象继承后调用
        //父亲抚养4个孩子成人
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        Child4 c4 = new Child4();
        System.out.println("大儿子："+ c1.raise());
        System.out.println("二儿子："+ c2.raise());
        System.out.println("三儿子："+ c3.raise());
        System.out.println("小女儿："+ c4.raise());
        //结论：子类可以继承抽象类中的已实现的方法。和继承普通父类完全一样
        //父亲将4个儿女叫到一起
        //程序中，集中保存东西，都是使用数组
        //问题1：4个儿女对象，数据类型不同，如何放在同一个数组中
        //解决：父类型的引用，可以指向任何子类对象。完全可以将数组元素的类型，统一定义为父类型
        Father[] children = {c1, c2, c3, c4};
        System.out.println("大儿子 |  二儿子  |  三儿子  |  小女儿 ");
        //因为每个孩子都帮父亲实现了pay方法。可以循环调用每个孩子的pay方法
        for (int i = 0; i < children.length; i++) {
            //问题2：children中每个元素是什么类型？凭什么可以调用子类实现的pay方法
            //原因：children中的每个元素都是Fathe父类，子类中都重写了父类抽象方法pay，所以父类型的引用，可以调用子类对象重写的父类方法
            System.out.print(children[i].pay()+"万    ");
        }
        System.out.println();
        //父亲公布遗产：
        for (int i = 0; i < children.length; i++) {
            System.out.print(children[i].pay()*5+"万   ");
        }
    }
}
