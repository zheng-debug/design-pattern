package com.design.designpattern.strategyPattern;

public class MallardDuck extends Duke {

    public MallardDuck(){
       quackBehavior = new Quack();
       flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("这是一只MallardDuck，它会：");
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
        duck.performFly();
    }
}
