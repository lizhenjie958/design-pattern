package com.jie.pattern.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    // 属性，策略接口
    public abstract void display();  // 显示鸭子信息
    public void quack(){
        System.out.println("鸭子呱呱叫");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    // 设置飞行的行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
