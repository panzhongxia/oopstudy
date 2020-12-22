package day03;

public class Human {
    public void sleep() {
        System.out.println("Human sleep..");
    }

    public static void main(String[] args) {
        Human h = new Male();// 向上转型
        h.sleep();
        Male m = new Male();// 干嘛要向上转型
        m.sleep();
        // h.speak();此方法不能编译，报错说Human类没有此方法
    }
}

class Male extends Human {
//    @Override
//    public void sleep() {
//        System.out.println("Male sleep..");
//    }

    public void speak() {
        System.out.println("I am Male");
    }
}

class Female extends Human {
//    @Override
    public void sleep() {
        System.out.println("Female sleep..");
    }

    public void speak() {
        System.out.println("I am Female");
    }

}
