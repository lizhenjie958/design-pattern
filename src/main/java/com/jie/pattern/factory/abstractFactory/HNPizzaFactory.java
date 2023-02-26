package com.jie.pattern.factory.abstractFactory;

public class HNPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("greek".equals(type)){
            pizza = new HNGreekPizza();
            pizza.setName("河南希腊披萨");
        }else if("cheese".equals(type)){
            pizza.setName("河南奶酪披萨");

        }
        return pizza;
    }
}
