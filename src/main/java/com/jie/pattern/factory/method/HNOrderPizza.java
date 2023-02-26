package com.jie.pattern.factory.method;

public class HNOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("greek".equals(type)){
            pizza = new HNGreekPizza();
            pizza.setName("希腊");
        }else if("cheese".equals(type)){
            pizza = new HNCheesePizza();
            pizza.setName("奶酪");
        }
        return pizza;
    }
}
