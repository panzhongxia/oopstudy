package day01;

public class Driver {
    //使用形参方式发生依赖关系
    public void drive1(Car car){
        car.run();
    }
    //使用局部变量发生依赖关系
    public void drive2(){
        Car car = new Car();
        car.run();
    }
    //使用静态变量发生依赖关系
    public void drive3(){
        Car.run();
    }
    //使用成员变量形式实现关联
    Car mycar;
    public void drive(){
        mycar.run();
    }

    public static void main(String[] args){
        Driver d = new Driver();
        Car c = new Car();
        d.drive1(c);
        d.drive();
    }
}
