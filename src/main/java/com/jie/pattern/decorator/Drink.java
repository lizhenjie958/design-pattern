package com.jie.pattern.decorator;

public abstract class Drink {
    public String desc; //描述
    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public float getPrice() {
        return price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
