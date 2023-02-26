package com.jie.principle.single;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("汽车");
        vehicle3.runWater("轮船");
        vehicle3.runAir("飞机");
    }
}

/**
 * 方案3
 * 改动较小，虽然在类级别上不是单一职责原则，但在方法级别上遵守了单一职责原则
 */
class Vehicle3{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空行驶");
    }

}
