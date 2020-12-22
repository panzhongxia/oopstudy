package day04;

public class Test {
    public static void main(String[] args){
        Shop s = new Shop();
        //先看进价 5.5
//        System.out.println(s.buying);
        //看了售价 8
//        System.out.println(s.price);
        System.out.println(s.getPrice());
        //将售价price改为0.01
//        s.price=0.01;
        s.sale(50,10);

        //静态成员
        //1.静态变量不需要创建任何对象，使用类名直接访问
        //将静态的信号灯变为’绿‘
        //之前，已经执行了static块的内容
//        Car.tLight = '绿';
        Car.setTLight('绿');
        //实例化两辆车，车号分别1，2，车灯都是关
        //构造方法执行了2次
        Car c1 = new Car(1, '关');
        Car c2 = new Car(2, '关');
        //查看两辆车的行驶状态
        c1.drive();
        c2.drive();
        //2. 修改静态变量，会影响所有对象
//        Car.tLight = '红';
        Car.setTLight('红');
        c1.drive();
        c2.drive();
        //3. 使用对象也可以访问静态成员变量，但是会有警告
//        c1.tLight='绿';
        Car.setTLight('绿');
        c1.drive();
        c2.drive();
        //4.修改实例变量，仅影响当前对象
        c2.turnLamp(); //c2打开了自己的车灯
        c1.drive();
        c2.drive();

        //为c1,c2洗车 工具类工具方法
        Car.wash(c1);
        Car.wash(c2);

        //final测试
//        IPhone ifeng = new IPhone(type);
        IPhone ifeng = new IPhone("5c");
        System.out.println(ifeng.getType());
        ifeng.reset();
        System.out.println(ifeng.getType());
//        ifeng = new NewIPhone("5c");
        ifeng.send("12312312345", "他乡遇故知！");
        ifeng.send("12312312345", "舍友！");
        ifeng.send("192.168.100.102",8080, "你是我的小苹果！");
        //访问常量：有static修饰，用法和static一致
        System.out.println(IPhone.OS);
    }
}
