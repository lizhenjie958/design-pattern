package com.jie.pattern.adapter.interfaceAdapter;


/**
 * 对象适配器模式 由于类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            /**
             * 只需要覆盖需要使用的方法
             * @return
             */
            @Override
            public int output5V() {
                System.out.println("接口适配器模式，只需要覆盖需要使用的方法");
                Voltage220V voltage220V = new Voltage220V();
                int i = voltage220V.output220V();
                int disc = i / 44 ;
                System.out.println("接口适配器模式， 转换后的电压是"+ disc);
                return disc;
            }
        };
        Phone phone = new Phone();
        phone.charging(abstractAdapter);
    }
}
