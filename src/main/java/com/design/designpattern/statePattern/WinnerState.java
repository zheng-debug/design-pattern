package com.design.designpattern.statePattern;

/**
 * 售卖状态
 */
public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投入了两毛五");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不好意思，你已经转动了手柄，不能退钱了");
    }

    @Override
    public void trunCrank() {
        System.out.println("你已经转动过手柄了，别摇了");
    }

    //执行售出糖果操作，如果糖果数大于0，则转为未投币状态，如果小于0，则转为售罄状态
    @Override
    public void dispense() {
        System.out.println("你厉害，你中奖了");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }
}
