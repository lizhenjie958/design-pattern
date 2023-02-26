package com.jie.pattern.builder;

public class HighBuilding extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("高楼打地基5米");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙15米");
    }

    @Override
    void roofed() {
        System.out.println("高楼盖透明房顶");
    }
}
