package com.design.designpattern.decoratePattern;


/**
 * 设计被装饰者超类，用于确定下级子类具有相同对象，便于进行装饰者对被装饰者的替换。
 * 通常装饰着模式使用抽象类作为超类，但在java已经可以使用接口进行设计。
 */
public abstract class Beverage {

    public String description = "This is a Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
