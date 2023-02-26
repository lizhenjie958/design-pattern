package com.jie.pattern.factory.simple;

public class SimpleFacotry {

    public Pizza createPizza1(String type){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式1");
        if("greek".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if("cheese".equals(type)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }
        return pizza;
    }

    /**
     * 一般使用静态工厂这种方式
     * @param type
     * @return
     */
    public static Pizza createPizza2(String type){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式2");
        if("greek".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if("cheese".equals(type)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }
        return pizza;
    }
}
