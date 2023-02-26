package com.jie.pattern.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentConditions();
        // 增加一个百度的观察者
        Observer observer1 = new BaiduSite();
        weatherData.registerObserver(observer);
        weatherData.registerObserver(observer1);

        // 通知测试
        weatherData.setData(10f,100f,30.3f);
    }
}
