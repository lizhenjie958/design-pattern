package com.jie.pattern.adapter.objectAdapter;


/**
 * 对象适配器模式 由于类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        Phone phone = new Phone();
        phone.charging(voltageAdapter);
    }
}
