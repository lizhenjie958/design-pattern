package com.jie.pattern.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆-----------");
        SoyaMilk soyaMilk1 = new RedBeanSoyaMilk();
        soyaMilk1.make();

        System.out.println("制作花生豆浆----------");
        SoyaMilk soyaMilk2 = new PeanuSoyaMilk();
        soyaMilk2.make();

        System.out.println("制作纯豆浆----------------");
        SoyaMilk soyaMilk3 = new PureSoysMilk();
        soyaMilk3.make();
    }
}
