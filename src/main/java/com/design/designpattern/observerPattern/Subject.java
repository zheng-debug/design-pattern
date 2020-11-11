package com.design.designpattern.observerPattern;


/**
 * 观察者设计模式
 *      创建主题接口，定义注册观察者、注销观察者、通知观察者等方法。
 */
public interface Subject {

    //注册观察者
    public void registerObserver(Observer observer);

    //注销观察者
    public void removeObserver(Observer observer);

    //当主题状态改变时，调用此方法通知所有观察者
    public void notifyObserver();
}
