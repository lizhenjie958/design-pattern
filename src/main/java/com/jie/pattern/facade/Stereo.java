package com.jie.pattern.facade;

public class Stereo {
    private static String className = Stereo.class.getSimpleName();

    // 使用饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(className + " on");
    }

    public void off(){
        System.out.println(className + " off");
    }

    public void up(){
        System.out.println(className + " up");
    }

}
