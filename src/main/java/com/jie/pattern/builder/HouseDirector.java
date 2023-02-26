package com.jie.pattern.builder;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    /**
     * 构造传入
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * set注入
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何建造房子，交给指挥者
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildhHouse();
    }
}
