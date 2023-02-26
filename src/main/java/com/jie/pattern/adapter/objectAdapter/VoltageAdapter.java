package com.jie.pattern.adapter.objectAdapter;

import com.jie.pattern.adapter.classAdapter.IVoltage5V;

class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        System.out.println("使用对象适配器进行转换");
        int i = voltage220V.output220V();
        int dis = i / 44;
        return dis;
    }
}
