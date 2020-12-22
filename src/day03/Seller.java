package day03;

public class Seller extends User{
    int fans;
    double service;

    public void modifyOrder(){
        System.out.println(name+"修改订单");
    }

    public void modifyProduct(){
        System.out.println(name+"修改商品");
    }
}
