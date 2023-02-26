package com.jie.pattern.memento.theory;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 保存状态对象memento
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    // 通过备忘录对象获取状态
    public String getStateFromMemento(Memento memento){
        return memento.getState();
    }
}
