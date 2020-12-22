package day01;

public class People {
    Car car;
    House house;
    //聚合关系中作为成员变量的类一般使用set方法赋值
    public void setCar(Car car){
        this.car = car;
    }
    public void setHouse(House house){
        this.house = house;
    }

    public void driver(){
        System.out.println("车的型号："+car.getType());
    }
    public void sleep(){
        System.out.println("我在房子里睡觉"+house.getAddress());
    }


//    Soul soul;
//    Body body;
//    //组合关系中的成员变量一般会在构造方法中赋值
//    Public People(Soul soul, Body body){
//        This.soul = soul;
//        This.body = body;
//    }
//
//    Public void study(){
//        System.out.println(“学习要用灵魂”+soul.getName());
//    }
//    Public void eat(){
//        System.out.println(“吃饭用身体：”+body.getName());
//    }

}
