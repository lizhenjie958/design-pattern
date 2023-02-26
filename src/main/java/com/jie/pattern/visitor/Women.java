package com.jie.pattern.visitor;

public class Women extends Person {
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
