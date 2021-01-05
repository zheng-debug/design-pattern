package com.design.designpattern.compoundPattern;

public class RedHeadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("红头鸭子叫");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
