package day05;

/**
 * 封装建设银行ATM机功能的类
 * 所以ATM机类都必须遵守银联的标准接口。
 * 所有ATM机类都必须实现银联标准接口中所有抽象方法的定义
 * 编译错误：实现接口，就必须实现接口中所有抽象方法
 * 解决：add unimplement method
 */
public class ATMCBC implements IUnionPay, IPolice{
    //实现类中，除了实现接口方法外，还可以定义自己专有的成员
    public Card card;
    public void setCard(Card card) {
        this.card = card;
    }
    //@Override：断言机制。就是告诉编译器当前方法是重写父类方法，请编译器协助检查方法签名
    //如果重写的方法签名在父类中没有找到，则编译错误
    @Override
    public boolean checkPwd(String input) {
        //1.判断用户输入的input和card对象中的pwd属性是否相同，如果相同，则返回true
        //注意：字符串比较不能使用==，必须使用equals方法
        if(input.equals(card.pwd)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean drawMoney(double money) {
        //先检查card对象中bal属性是否>=取款金额money，如果>=则可以正常取款，返回true，否则返回false
        if(card.bal>=money){
            card.bal -= money;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double getBalance() {
        return card.bal;
    }

    @Override
    public void takePic() {
        System.out.println("您已进入摄像区域.....");
    }
}
