package com.jie.pattern.visitor;

public abstract class Action {
    /// 等到男性的测评结果
    public abstract void getManResult(Man man);
    // 等到女性的测评结果
    public abstract void getWomenResult(Women women);
}
