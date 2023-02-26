package com.jie.pattern.state.lottery;

/**
 * 状态抽象类，将每个状态相关的动作提取
 */
public abstract class State {
    // 扣除积分
    public abstract void deductMoney();
    // 是否抽中奖品
    public abstract boolean raffle();
    // 发放奖品
    public abstract void dispensePrize();
}
