package com.design.designpattern.statePattern;

/**
 * 状态模式
 */
public interface State {

    //投入钱
    void insertQuarter();

    //要退钱
    void ejectQuarter();

    //转动手柄
    void trunCrank();

    //发糖
    void dispense();

}
