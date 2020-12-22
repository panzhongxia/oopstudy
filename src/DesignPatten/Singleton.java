package DesignPatten;

//饿汉式-静态常量
/**
public class Singleton {
    private static Singleton instance = new Singleton();
    private  Singleton(){}
    public static Singleton getInstance() {
        return instance;
    }
}**/
//饿汉式-静态代码块
/**
public class Singleton {
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    private Singleton() {}
    public static Singleton getInstance(){
        return instance;
    }
}**/

//懒汉式-线程非安全
/**
public class Singleton {
    private static Singleton singleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}**/
//懒汉式-线程安全
public class Singleton{
    private static Singleton singleton;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}