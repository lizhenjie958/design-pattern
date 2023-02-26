package com.jie.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<College> collegeList ;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("==============" + college.getName() + "==============" );
            // 得到对应的迭代器
            printDepartment(college.createIterator());
        }
    }

    // 输出学院的系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
