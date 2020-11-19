package com.design.designpattern.decoratePattern;


/**
 * 基础被包装类
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 10.77;
    }
}
