package com.design.designpattern.decoratePattern;

/**
 * 基础被包装类
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 10.23;
    }
}
