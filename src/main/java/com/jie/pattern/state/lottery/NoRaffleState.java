package com.jie.pattern.state.lottery;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState extends State {

    private RaffleActivity raffleActivity;
    /**
     * 初始化时将活动引入进来
     */
    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }


    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
