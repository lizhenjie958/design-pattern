package com.jie.pattern.template;

public class PureSoysMilk extends SoyaMilk {
    @Override
    void addComdiments() {
        // 这是一个空实现
    }
    @Override
    Boolean isAddComdiments(){
        return false;
    }
}
