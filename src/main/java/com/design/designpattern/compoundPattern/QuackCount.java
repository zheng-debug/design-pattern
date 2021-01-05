package com.design.designpattern.compoundPattern;


public class QuackCount implements Quackable {

    Quackable quackable;
    public static int quackCount;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
    }


    @Override
    public void quack() {
        quackable.quack();
        quackCount++;
        notifyObservers();
    }

    public static int getQuackCount(){
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
