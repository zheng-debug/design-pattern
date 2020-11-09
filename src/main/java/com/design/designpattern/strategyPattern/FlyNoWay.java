package com.design.designpattern.strategyPattern;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("不会飞行的鸭子");
    }
}
