package com.jie.pattern.adapter.objectAdapter;

import com.jie.pattern.adapter.classAdapter.IVoltage5V;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压正常，可以充电");
        }else {
            System.out.println("电压不正常，不可以充电");
        }
    }
}
