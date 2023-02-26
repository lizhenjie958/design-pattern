package com.jie.pattern.builder;

public abstract class HouseBuilder {
    House house = new House();
    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();

    /**
     * 建造好房子后，将产品返回
     * @return
     */
    public House buildhHouse(){
        return house;
    }
}
