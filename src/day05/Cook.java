package day05;

import com.sun.org.omg.SendingContext.CodeBase;

/**
 * 封装厨师属性和功能的类
 */
public abstract class Cook {
    public String name; //厨师姓名

    /**
     * 厨师类型的带参构造方法
     * @param name 厨师的姓名
     */
    public Cook(String name) {
        this.name = name;
    }

    /**
     * 仅要求厨师必须能做菜
     * 具体做什么菜，需要根据实现类的具体方法实现决定
     */
    public abstract void cook();
}

//
//
///**
// * 封装一个川菜厨子的类
// */
//class SiChuan extends Cook{
//
//    /**
//     * 厨师类型的带参构造方法
//     *
//     * @param name 厨师的姓名
//     */
//    public SiChuan(String name) {
//        super(name);
//    }
//
//    /**
//     * 一位川菜厨子会做辣子鸡
//     */
//    @Override
//    public void cook() {
//        System.out.println(name+" 做辣子鸡......");
//    }
//}
//
///**
// * 封装一位鲁菜厨子的类
// */
//class ShanDong extends Cook{
//
//    /**
//     * 厨师类型的带参构造方法
//     *
//     * @param name 厨师的姓名
//     */
//    public ShanDong(String name) {
//        super(name);
//    }
//
//    /**
//     * 一位鲁菜厨子会做黄河鲤鱼
//     */
//    @Override
//    public void cook() {
//        System.out.println(name+" 做黄河鲤鱼....");
//    }
//}
//
