package com.design.designpattern.javaOberverPattern;

import java.util.Observable;

/**
 * 继承被观察者类，超类中已经完成了对观察者的管理
 * 当调用setMeasurements()方法后，会更改是否改变的boolean值，
 * 同时调用notifyObservers()方法，通知观察者更新数据。
 */
public class WeatherData extends Observable {

    private float a1;
    private float a2;
    private float a3;

    public void measurementsChange(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float a1, float a2, float a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        measurementsChange();
    }

    public float getA1() {
        return a1;
    }

    public float getA2() {
        return a2;
    }

    public float getA3() {
        return a3;
    }
}
