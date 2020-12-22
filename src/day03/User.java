package day03;

public class User {
    String name;
    String address;
    String mobile;

    public void searchProducts(){
        System.out.println(name+"查询商品...");
    }

    public void searchOrders(){
        System.out.println(name+"查询订单...");
    }
}
