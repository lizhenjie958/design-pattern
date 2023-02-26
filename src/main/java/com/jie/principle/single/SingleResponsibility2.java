package com.jie.principle.single;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 方案2
 * 遵守了单一职责原则
 * 改动的类较多，同时要客户端
 * 改进：直接修改vehicle类，改动的代码少    --》 方案3
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
}


class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空行驶");
    }
}

