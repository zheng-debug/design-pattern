package com.design.designpattern.compoundPattern;

public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("鸭鸣器叫");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
