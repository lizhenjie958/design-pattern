package com.jie.pattern.decorator;

public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // 自己的价格 + drink的花费
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "" + super.getPrice() + " " + obj.getDesc();
    }
}
