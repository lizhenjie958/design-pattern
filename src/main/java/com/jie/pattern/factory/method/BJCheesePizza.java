package com.jie.pattern.factory.method;

class BJCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("北京的"+name+"披萨在做准备");

    }
}
