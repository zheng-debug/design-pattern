package com.design.designpattern.javaOberverPattern;

import com.design.designpattern.observerPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentSumDisplay implements Observer, DisplayElement {

    private float a1;
    private float a2;
    private float a3;
    Observable observable = new Observable();

    public CurrentSumDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前主题内数据之和：" + (a1 + a2 + a3));
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
