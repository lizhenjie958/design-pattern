package com.jie.pattern.facade;

public class Projector {
    private static String className = Projector.class.getSimpleName();

    // 使用饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(className + " on");
    }

    public void off(){
        System.out.println(className + " off");
    }

    public void focus(){
        System.out.println(className + " focus");
    }
}
