package day05;

/**
 * 封装大儿子的类
 */
public class Child1 extends Father {
    //编译错误：因为只要继承了抽象类，就必须重新父类的抽象方法！
    //解决：鼠标方法在错误上，选择add unimplement method
    @Override
    public double pay() {
        return 10;  //大儿子给10万
    }
}
