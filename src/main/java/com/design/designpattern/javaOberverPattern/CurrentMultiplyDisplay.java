package com.design.designpattern.javaOberverPattern;

import com.design.designpattern.observerPattern.DisplayElement;
import java.util.Observer;

import java.util.Observable;

public class CurrentMultiplyDisplay implements Observer, DisplayElement {
    private float a1;
    private float a2;
    private float a3;
    private Observable observable;

    //重写构造方法，将当前观察者加入观察者列表中。
    public CurrentMultiplyDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前数据之积为：a1*a2*a3 = " + (a1*a2*a3));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){//判断数据类型是否为被观察者类型
            WeatherData weatherData = (WeatherData) o;
            this.a1 = weatherData.getA1();
            this.a2 = weatherData.getA2();
            this.a3 = weatherData.getA3();
            display();

        }
    }
}
