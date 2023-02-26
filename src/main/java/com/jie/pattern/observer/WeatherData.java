package com.jie.pattern.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    // 观察者集合
    private List<Observer> observerList;

    /**
     * 数据更新推送
     */
    public void dataChange(){
        notifyObserver();
    }

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 遍历所有的观察者，并通知
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }

    public static double rectangle(double longth, double width, double x){
        return longth * width /x;
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startDate = now.minusDays(20).withHour(0).withMinute(0).withSecond(0);
        LocalDateTime endDate = now.withHour(23).withMinute(59).withSecond(59);


        LocalDateTime tempStartTime = startDate;
        while (tempStartTime.isBefore(endDate)){
            LocalDateTime temEndDate = tempStartTime.plusDays(4).minusSeconds(1).isBefore(endDate) ? tempStartTime.plusDays(4).minusSeconds(1) : endDate;
            System.out.println(tempStartTime + "        " + temEndDate);
            tempStartTime = tempStartTime.plusDays(4);
        }

    }
}
