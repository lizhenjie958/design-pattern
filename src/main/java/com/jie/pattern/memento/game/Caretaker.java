package com.jie.pattern.memento.game;

public class Caretaker {
    // 保存一个状态
    private Memento memento;
    // 保存多个状态
//    private List<Memento> mementoList;
    // 对多个游戏角色保存多个状态
//    private Map<String,List<Memento>> roleMementoMa;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
