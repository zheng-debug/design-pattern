package com.design.designpattern.compoundPattern;

/**
 * 观察者类，当被观察者内部数据发生变化时，调用本类更新方法
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("什么玩意在叫？" + quackObservable + "===================");
    }
}
