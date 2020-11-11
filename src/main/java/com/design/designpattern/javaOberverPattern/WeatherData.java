package com.design.designpattern.javaOberverPattern;

import java.util.Observable;

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
