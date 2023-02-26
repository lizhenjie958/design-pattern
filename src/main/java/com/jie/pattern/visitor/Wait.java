package com.jie.pattern.visitor;

/**
 * 添加一种新的行为，只需实现该类就可以
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手待定");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人给的评价是该歌手待定");
    }
}
