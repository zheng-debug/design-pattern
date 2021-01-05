package com.design.designpattern.compoundPattern;

import javafx.beans.InvalidationListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者类
 */
public class DuckObservable extends Observable {

    ArrayList observers = new ArrayList<>();

    //注册到被观察者列表中
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //通知观察者更新数据
  /*  public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (DuckObserver) iterator.next();
        }
    }*/
}


