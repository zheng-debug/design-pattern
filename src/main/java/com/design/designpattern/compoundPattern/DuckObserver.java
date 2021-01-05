package com.design.designpattern.compoundPattern;


import java.util.Observable;
import java.util.Observer;

/**
 * 观察者类
 */
public class DuckObserver implements Observer {

    private Observable observable;

    public DuckObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Quackable){//判断数据类型是否为被观察者类型
            Quackable observable = (Quackable) o;
            System.out.println("===========================");
            System.out.println("什么东西在叫?");
            observable.quack();
            System.out.println("===========================");
        }
    }
}
