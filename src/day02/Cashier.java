package day02;

public class Cashier {
    public void pay(double money){
        System.out.println("收款："+money);
        System.out.println("验钞...");
        System.out.println("找零...");
        System.out.println("用现金支付成功！");
    }
    public void pay(String cardId, String cardPwd){
        System.out.println("连接发卡行");
        System.out.println("验证卡号，密码...");
        System.out.println("打印凭条，持卡人签字...");
        System.out.println("用信用卡支付成功！");
    }
}
