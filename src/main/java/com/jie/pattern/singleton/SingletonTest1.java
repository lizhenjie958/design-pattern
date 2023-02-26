package com.jie.pattern.singleton;

public class SingletonTest1 {
    public static void main(String[] args) {
//        System.out.println(Singleton7.getInstance() == Singleton7.getInstance());
        System.out.println(Singleton8.INSTANCE == Singleton8.INSTANCE);
    }
}

/**
 * 饿汉式1 （静态常量）   --》 线程安全，但可能引起内存浪费
 */
class Singleton1{
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){};

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}

/**
 * 饿汉式2 （静态代码块）   --》 线程安全，但可能引起内存浪费
 */
class Singleton2{

    private Singleton2(){};

    private static  Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式1  线程不安全，实际开发中不能使用这样的方式！
 */
class Singleton3{
    private Singleton3(){};

    private static  Singleton3 instance;

    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 懒汉式2  线程安全，同步方法,效率低，不推荐使用！
 */
class Singleton4{
    private Singleton4(){};

    private static  Singleton4 instance;

    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}

/**
 * 懒汉式3  线程不安全，垃圾代码，不推荐使用！
 */
class Singleton5{
    private Singleton5(){};

    private static  Singleton5 instance;

    public static  Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}

/**
 * 双重检查   推荐使用！！！
 */
class Singleton6 {
    private Singleton6(){};

    private static volatile Singleton6 instance;

    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized (Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类   线程安全，效率高，实现了延迟加载。推荐使用！
 */
class Singleton7{
    private Singleton7(){};
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

enum Singleton8{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok!!");
    }
}