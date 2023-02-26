package com.jie.pattern.facade;

public class TheaterLight {
    private static String className = TheaterLight.class.getSimpleName();

    // 使用饿汉式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(className + " on");
    }

    public void off(){
        System.out.println(className + " off");
    }

    public void dim(){
        System.out.println(className + " dim");
    }

    public void bright(){
        System.out.println(className + " bright");
    }

}
