package com.jie.pattern.adapter.interfaceAdapter;

public abstract class AbstractAdapter implements IVoltage5V{
    @Override
    public int output5V() {
        System.out.println("接口适配器，使用5v电压");
        return 0;
    }

    @Override
    public int output22V() {
        System.out.println("接口适配器，使22v电压");
        return 0;
    }

    @Override
    public int output100V() {
        System.out.println("接口适配器，使100v电压");
        return 0;
    }
}
