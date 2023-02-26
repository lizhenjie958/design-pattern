package com.jie.pattern.memento.theory;

import java.util.ArrayList;
import java.util.List;

// 备忘录管理集合
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
