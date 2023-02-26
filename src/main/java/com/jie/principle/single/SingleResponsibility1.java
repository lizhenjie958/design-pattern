package com.jie.principle.single;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}

/**
 * 方案1
 * 交通工具类的run方法，违反了单一职责原则。根据交通工具的不同运行方式分解为不同的类 --》 方案2
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上行驶");
    }
}
