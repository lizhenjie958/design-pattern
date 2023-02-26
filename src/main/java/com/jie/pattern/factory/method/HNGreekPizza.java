package com.jie.pattern.factory.method;

class HNGreekPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("河南的"+name+"披萨在做准备");
    }
}
