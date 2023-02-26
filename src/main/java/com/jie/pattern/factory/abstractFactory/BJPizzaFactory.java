package com.jie.pattern.factory.abstractFactory;

public class BJPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("greek".equals(type)){
            pizza = new BJGreekPizza();
            pizza.setName("北京希腊披萨");
        }else if("cheese".equals(type)){
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        }
        return pizza;
    }
}
