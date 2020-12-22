package day03;

public class Test {
    public static void main(String[] args){
        User u=new User();
        Customer c=new Customer();
        Seller s=new Seller();
        //先泛化，再继承
        c.name="白富美";
        s.name="店小二";
        c.searchOrders();
        s.searchProducts();

        IPad air2 = new IPad(9.7, 8759);
        System.out.println("屏幕："+air2.screen+"; 电池："+air2.battery);
        IPhone if6 = new IPhone(4.7, 1810, "12312312345");
        System.out.println("屏幕："+if6.screen+"; 电池："+if6.battery+"; 手机号: "+if6.mobile);

        //向上转型的测试
        IPad charger;
        charger=air2;
        charger=if6;
        charger(charger);
        charger(air2);

        System.out.println(if6.mobile);
        //向上转型后无法使用子类特有的功能属性
//        System.out.println(charger.mobile);
    }
    public static void charger(IPad charger){
        System.out.println(charger.toString()+" 正在充电....");
    }
}

class IPad{
    double screen;
    int battery;
    IPad(){
        this.screen=0.0;
        this.battery = 0;
    }
    IPad(double screen, int battery){
        this.screen=screen;
        this.battery = battery;
    }
}

class IPhone extends IPad{
    String mobile;
//    IPhone() {
//        super();
//        this.mobile=null;
//    }
    IPhone(double screen, int battery, String mobile) {
        super(screen,battery);
        this.mobile = mobile;
    }
}