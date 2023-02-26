package com.jie.pattern.bridge;

public abstract class Phone {
    // 组合品牌
    private Brand brand;

    public Phone() {
    }
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }
    protected void open(){
        brand.open();
    }
    protected void close(){
        brand.close();
    }
    protected void call(){
        brand.call();
    }
}
