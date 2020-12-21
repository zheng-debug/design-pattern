package com.design.designpattern.statePattern;

import java.util.Random;

/**
 * 投入25美分
 */
public class HasQuarterState implements State{

    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经有钱了，就别投了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("好好好，退钱给你");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void trunCrank() {
        System.out.println("好好好，开始转手柄吧");
        int winner = randomWinner.nextInt(10);
        System.out.println("随机数：" + winner);
        if ((winner == 0 ) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("你还没转动手柄");
    }
}
