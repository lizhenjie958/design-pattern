package com.jie.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人
 */
public class ObjectStructure {
    // 维护一个集合
    private List<Person> presons = new LinkedList<>();
    // 增加到list
    public void attach(Person person){
        presons.add(person);
    }
    // 移除
    public void deatch(Person person){
        presons.remove(person);
    }
    // 显示测评情况
    public void display(Action action){
        for(Person person : presons){
            person.accept(action);
        }
    }
}
