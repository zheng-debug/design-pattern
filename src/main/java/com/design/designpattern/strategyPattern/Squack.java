package com.design.designpattern.strategyPattern;

public class Squack implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱叫的鸭子");
    }
}
