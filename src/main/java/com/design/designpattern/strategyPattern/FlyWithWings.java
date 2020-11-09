package com.design.designpattern.strategyPattern;

public class FlyWithWings implements FlyBehavior{

    public void fly() {
        System.out.println("鸭子用翅膀飞行");
    }
}
