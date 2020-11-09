package com.design.designpattern.strategyPattern;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫的鸭子");
    }
}
