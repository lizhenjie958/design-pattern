package com.jie.pattern.factory.method;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new BJGreekPizza();
            pizza.setName("希腊");
        }else if("greek".equals(type)){
            pizza = new BJCheesePizza();
            pizza.setName("奶酪");
        }
        return pizza;
    }
}
