package com.jie.pattern.factory.abstractFactory;

public class OrderPizza {
    public void order(AbsFactory absFactory, String type){
        Pizza pizza = absFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

class OrderPizzaTest{
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.order(new BJPizzaFactory(),"cheese");
    }
}
