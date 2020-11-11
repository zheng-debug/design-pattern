package com.design.designpattern.observerPattern;

/**
 * 定义观察者接口，接口中声明刷新观察者内部数据方法。
 */
public interface Observer {

    //刷新观察者内部数据方法
    public void update(float a1, float a2, float a3);

}
