package com.design.designpattern.statePattern;

/**
 * 售罄状态
 */
public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你放了钱进来，但是没糖了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你要退钱，但是糖果卖完了");
    }

    @Override
    public void trunCrank() {
        System.out.println("没糖了哦，别摇了");
    }

    @Override
    public void dispense() {
        System.out.println("没糖了，没得发");
    }
}
