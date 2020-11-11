package com.design.designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private float a1;
    private float a2;
    private float a3;

    //注册
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //注销
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0){
            observers.remove(i);
        }
    }

    //更改
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(a1, a2, a3);
        }
    }

    //调用更改
    public void measurementsChanged(){
        notifyObserver();
    }

    //修改主题内部数据
    public void setMeasurements(float a1, float a2, float a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        measurementsChanged();
    }


}
