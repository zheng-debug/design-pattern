package com.design.designpattern.decoratePattern;

/**
 * 基础装饰者
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    //定义装饰者构造方法，用于修饰被装饰者。
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
