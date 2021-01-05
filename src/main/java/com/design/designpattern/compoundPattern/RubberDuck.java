package com.design.designpattern.compoundPattern;

public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("橡皮鸭子叫");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
