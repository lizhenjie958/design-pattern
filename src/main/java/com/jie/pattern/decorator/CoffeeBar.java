package com.jie.pattern.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        // 点一份订单
        Drink order = new LongBlack();
        System.out.println("描述："+order.getDesc() + " ， 费用： " + order.cost());
        // 加牛奶
        order = new Milk(order);
        System.out.println("描述："+order.getDesc() + " ， 费用： " + order.cost());
        // 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("描述："+order.getDesc() + " ， 费用： " + order.cost());
        // 再次加入一份巧克力
        order = new Chocolate(order);
        System.out.println("描述："+order.getDesc() + " ， 费用： " + order.cost());

    }
}
