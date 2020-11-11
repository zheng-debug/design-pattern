package com.design.designpattern.observerPattern;

public class CurrentSumDisplay implements Observer, DisplayElement {

    private float a1;
    private float a2;
    private float a3;
    private Subject subject;

    //初始化观察者，并将该观察者注册入主题中
    public CurrentSumDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    //展示数据
    @Override
    public void display() {
        System.out.println("当前主题内数据之和：" + (a1 + a2 + a3));
    }

    //更新内部数据
    @Override
    public void update(float a1, float a2, float a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        display();
    }
}
