package com.jie.pattern.factory.method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        OrderPizza orderPizza = new BJOrderPizza();
        Pizza cheese = orderPizza.createPizza("cheese");
        cheese.prepare();
        cheese.bake();
        cheese.cut();
        cheese.box();
    }
}
