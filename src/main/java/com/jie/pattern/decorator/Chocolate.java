package com.jie.pattern.decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f);    // 调味品价格
    }

}
