package com.jie.pattern.memento.theory;

/**
 * 备忘录对象
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
