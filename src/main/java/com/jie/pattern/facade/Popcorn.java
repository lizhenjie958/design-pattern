package com.jie.pattern.facade;

public class Popcorn {
    private static String className = Popcorn.class.getSimpleName();
    // 使用饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(className + " on");
    }

    public void off(){
        System.out.println(className + " off");
    }

    public void pop(){
        System.out.println(className + " pop");
    }
}
