package com.design.designpattern.statePattern;

/**
 * 没有投入25美分
 */
public class NoQuarterState implements State{


    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了两毛五");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("里面没钱，咋退");
    }

    @Override
    public void trunCrank() {
        System.out.println("别摇啦，么有钱");
    }

    @Override
    public void dispense() {
        System.out.println("没钱还要吃糖，想啥呢");
    }
}
