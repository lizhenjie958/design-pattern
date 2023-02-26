package com.jie.pattern.factory.simple;

class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + " is preparing");
    }
}
