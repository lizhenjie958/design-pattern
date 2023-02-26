package com.jie.pattern.adapter.classAdapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int i = output220V();
        int dis = i / 44;
        return dis;
    }
}
