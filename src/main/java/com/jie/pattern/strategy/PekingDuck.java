package com.jie.pattern.strategy;

public class PekingDuck extends Duck {

    // 北京鸭可以飞翔，但是技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("=====北京鸭=======");
    }
}
