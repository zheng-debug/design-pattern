package com.design.designpattern.statePattern;

import lombok.Data;

@Data
public class GumballMachine {

    State soldState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    State state = soldState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        if(count > 0){
            state = noQuarterState;
        }
        this.count = count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void trunCrank() {
        state.trunCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("发放糖果一颗");
        if (count != 0){
            count = count - 1;
            System.out.println("还剩" + count + "颗糖果");
        }
    }
}
