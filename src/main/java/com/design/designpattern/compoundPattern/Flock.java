package com.design.designpattern.compoundPattern;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式，将多个鸭子加入到一个组合中，统一进行管理。
 */
public class Flock implements Quackable {

    ArrayList<Quackable> quackList = new ArrayList<>();

    public void add(Quackable quackable){
        quackList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackList.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
