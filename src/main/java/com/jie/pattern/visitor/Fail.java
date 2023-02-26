package com.jie.pattern.visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给歌手的评价是很失败");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人给歌手的评价是很失败");
    }
}
