package com.jie.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    // 需要知道Department，是以什么方式存放的
    List<Department> departmentList;
    int index = -1;   // 索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        }else{
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    /**
     * 删除的方法默认空实现
     */
    public void remove(){

    }
}
