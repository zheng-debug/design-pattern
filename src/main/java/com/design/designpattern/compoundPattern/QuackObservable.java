package com.design.designpattern.compoundPattern;


public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
