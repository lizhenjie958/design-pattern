package com.jie.pattern.strategy;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("========飞翔技术高超=====");
    }
}
