package day03;

import java.io.PipedInputStream;

public class Override {
    public static void main(String[] args) {
        double fee = 480;
        double money = 500;
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        p.pay(money,fee);
        c1.pay(money,fee);
        c2.pay(money,fee);

        //动态方法调度，new的是谁，就调用谁的方法
        Parent dad = null;
        Child1 son1 = new Child1();
        Child2 son2 = new Child2();

        dad = son1;
        dad.cook();

        dad = son2;
        dad.cook();

        dad = new Parent();
        dad.cook();
    }
}

class Parent{
    public void cook(){
        System.out.println("爸爸的任务：做饭");
    }
    public void pay(double money,double fee){
        System.out.println("家长让交："+fee+"当学费，剩下"+(money-fee)+"当零花钱");
    }
}

class Child1 extends Parent {
    public void cook(){
        System.out.println("帮大儿子做蛋炒饭");
    }

//    @java.lang.Override
    public void pay(double money, double fee) {
//        super.pay(money, fee);
        System.out.println("没交学费，都卖了"+money+"元的变形金刚");
    }
}

class Child2 extends Parent {
    public void cook(){
        System.out.println("帮小儿子包饺子");
    }
    public void pay(double money, double fee) {
        super.pay(money, fee);
        System.out.println("给爸爸当零花钱");
    }
}
