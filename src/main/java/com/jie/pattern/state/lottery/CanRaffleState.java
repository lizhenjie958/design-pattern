package com.jie.pattern.state.lottery;

import java.util.Random;

/**
 * 能抽奖的状态
 */
public class CanRaffleState extends State {

    private RaffleActivity activity;
    /**
     * 初始化时将活动引入进来
     */
    public CanRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    //可以抽奖, 抽完奖后，根据实际情况，改成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖机会
        if(num == 0){
            // 改变活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }


    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
