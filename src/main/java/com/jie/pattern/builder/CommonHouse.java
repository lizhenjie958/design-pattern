package com.jie.pattern.builder;

public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙15米");
    }

    @Override
    void roofed() {
        System.out.println("普通房子盖房顶");
    }
}
