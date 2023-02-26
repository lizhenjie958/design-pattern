package com.jie.pattern.facade;

public class Screen {
    private static String className = Screen.class.getSimpleName();

    // 使用饿汉式
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println(className + " up");
    }

    public void down(){
        System.out.println(className + " down");
    }

}
