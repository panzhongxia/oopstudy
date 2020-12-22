package day05;

import day04.Shop;

public class SubShop extends Shop{
    //重写父类的sale方法，使用super调用父类的sale方法
    //java规定，子类重写父类方法，子类中的方法访问控制范围不能小于父类方法的控制范围
    protected void sale(double money, double count) {
        super.sale(money, count);
    }
}
