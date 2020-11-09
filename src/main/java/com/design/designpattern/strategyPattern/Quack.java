package com.design.designpattern.strategyPattern;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("可以呱呱叫的鸭子");
    }
}
