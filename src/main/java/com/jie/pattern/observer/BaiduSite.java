package com.jie.pattern.observer;

public class BaiduSite implements Observer{
    // 温度，湿度，气压
    private float temperature;
    private float pressusre;
    private float homidity;

    /**
     * 更新天气情况
     */
    public void update(float temperature, float pressusre, float homidity){
        this.temperature = temperature;
        this.pressusre = pressusre;
        this.homidity = homidity;
        display();
    }

    /**
     * 显示
     */
    public void display(){
        System.out.println("百度======今天天气=====温度======="+temperature);
        System.out.println("百度======今天天气=====湿度======="+homidity);
        System.out.println("百度======今天天气=====气压======="+pressusre);
    }
}
