package day04;

//封装手机属性和功能的类
public final class IPhone {
    //定义一个只读的手机型号属性，初始化为5c
    //private修饰，再配读取方法
//    private final String type = "5c";
    private final String type;
    //定义一个所有iphone手机都会使用的常量ios
    //常量肯定不能修改，不必private也行
    static final String OS="ios";//编译错误：静态常量os还未初始化

    public IPhone(String type) {
        this.type = type; //最后一次修改！
    }

    public String getType() {
        return type;
    }

    //恢复出厂设置的方法
    public void reset() {
        System.out.println("清空内存");
        //type = "5s"; //编译错误：final修饰的成员变量不能赋值
        System.out.println("恢复操作系统");
    }

    /**
     * 发短信方法
     * @param mobile 手机号 方法内不能修改
     * @param msg 消息内容 方法内不能修改
     */
    public final void send(final String mobile, final String msg){
//        mobile = "+86"+mobile; //编译错误：final修饰的局部变量不能被赋值
        System.out.println("给"+mobile+"发："+msg);
    }

    /**
     * 重载发送消息的方法
     * @param ip  ip地址
     * @param port 端口号
     * @param msg 消息内容
     */
    public final void send(String ip,int port, String msg){
        System.out.println("向ip地址"+ip+"上的"+port+"端口发送");
    }
}
