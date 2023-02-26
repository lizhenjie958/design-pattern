package com.jie.pattern.observer;

/**
 * 观察者接口，由观察者实现
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
