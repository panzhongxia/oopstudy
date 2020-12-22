package day05;

/**
 * 封装父亲属性和功能的类
 * 因为内部包含抽象方法，所以也要定义为抽象类
 */
public abstract class Father {
    //父亲养育儿女的方法。儿女可以无条件继承
    //@return 养育的结果
    public String raise(){
        return "学业有成，成家立业";
    }

    //父亲请求子女帮忙偿还债务，也就是说，父亲无法自己完成
    //@return 每个子女负担的债务
    public abstract double pay();
}
