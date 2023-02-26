package com.jie.pattern.visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是歌手很成功！");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人给的评价是歌手很成功！");
    }
}
