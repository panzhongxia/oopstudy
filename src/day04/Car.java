package day04;

//封装汽车属性和功能
public class Car {
    private final int num;  //车号
    //只要希望所有对象，共享一个成员变量，就要使用static
//    static char tLight;   //信号灯
    private static char tLight;
    private char carLamp; //自己的车灯
    private static String license; //驾照的人名
    //静态块，仅在首次使用类之前执行一次
    static {
        System.out.println("开车前--考驾照");
        license="张三的驾照";
    }

    //专门修改信号灯的方法
    //静态方法中，只能使用静态变量
    public static void setTLight(char t1) {
        tLight = t1;
    }

    public Car(int num, char carLamp) {
        //每次创建对象时，都会执行
        System.out.println(license+"买了第"+num+"辆车");
        this.num = num;
        this.carLamp = carLamp;
    }

    //反应汽车驾驶状态的方法
    public void drive(){
        System.out.println(license+"在开"+num+"号车"+carLamp+"着灯"
                          +(tLight=='红'?"Stop!":"Run..."));
    }

    //开关自己车灯的方法
    public void turnLamp(){
        carLamp=carLamp=='关'?'开':'关';
    }
//    public void wash(Car car){
//        System.out.println(car.num+"号车清洗完毕");
//    }
    //洗车方法，只要是车都能洗，和具体对象无关，定义为static
    public static void wash(Car car){
        //在静态方法中不能引用非静态的成员变量，不能使用普通实例变量
        System.out.println(car.num+"号车清洗完毕");
    }
}
