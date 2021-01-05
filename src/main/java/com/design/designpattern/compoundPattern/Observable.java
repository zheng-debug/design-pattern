package com.design.designpattern.compoundPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 被观察者类
 */
public class Observable implements QuackObservable {
    //定义观察者列表
    public ArrayList observers = new ArrayList();

    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
