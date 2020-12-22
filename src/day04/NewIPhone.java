package day04;

//封装新手机属性和功能的类
//public class NewIPhone extends IPhone{
//    //新编译错误：不能继承自final修饰的class
//    //编译错误，父类中定义了带参构造，就没有默认构造了
//    //解决：让子类主动调用父类的带参构造
//
//    /**
//     * 重写父类的构造方法
//     * @param type
//     */
//    public NewIPhone(String type) {
//        super(type); //直接调用父类带参构造方法
//    }
//
//    /**
//     * 子类重写的父类send方法
//     * 说明，重写和final没关系，仅关注方法名和参数类型列表
//     * @param mobile 手机号 方法内不能修改
//     * @param msg 消息内容 方法内不能修改
//     */
////    public void send(String mobile, String msg) {
////        //编译错误，不能重写（override）来自父类final方法
////        //调用父类send方法正常发短信
////        super.send(mobile, msg);
////        //调用父类send方法给老婆再发一条
////        super.send("我老婆的手机号", msg);
////    }
//}
