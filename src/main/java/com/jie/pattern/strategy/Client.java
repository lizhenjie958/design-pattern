package com.jie.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        System.out.println("======传入新的飞行策略======");
        pekingDuck.setFlyBehavior(new NoFlyBehavior() );
        pekingDuck.fly();
    }
}
