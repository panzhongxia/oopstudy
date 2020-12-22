package day02;

public class Girl {
    String house;
    String car;
    double deposit;

    Girl(){}

    Girl(String house,double deposit){
        this.house = house;
        this.deposit  =  deposit;
    }

//    Girl(String house,String car,double deposit){
//        this.house = house;
//        this.car = car;
//        this.deposit  =  deposit;
//    }
    Girl(String house,String car,double deposit){
        this(house,deposit);
        this.car = car;
    }
    public void printInfo() {
        System.out.println("房子：" + house
                           +"，车子：" + car
                           +"，存款：" + deposit);
    }
}
