package com.jie.pattern.facade;

public class DVDPlayer {
    private static String className = DVDPlayer.class.getSimpleName();

    // 使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(className + " on");
    }

    public void off(){
        System.out.println(className + " off");
    }

    public void play(){
        System.out.println(className + " play");
    }

    public void pause(){
        System.out.println(className + " psuse");
    }
}
