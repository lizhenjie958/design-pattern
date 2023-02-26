package com.jie.pattern.builder;

/**
 * 建造者模式，将产品和构建的过程隔离
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);

        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);
        House house1 = houseDirector1.constructHouse();

    }
}
