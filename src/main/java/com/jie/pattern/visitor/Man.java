package com.jie.pattern.visitor;

/**
 * 1、使用双分派，即首先在客户端程序中，将具体状态作为参数传递在men中（第一次分派）
 * 2、men类调用作为参数的具体方法中的getManResult，同时将自己作为参数，做2次分派
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
