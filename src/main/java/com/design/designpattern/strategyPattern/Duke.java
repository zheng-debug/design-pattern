package com.design.designpattern.strategyPattern;

public abstract class Duke {

     //定义鸭子叫的接口
     QuackBehavior quackBehavior;

     //定义飞行接口
     FlyBehavior flyBehavior;

     //实现鸭子具体行为
     public void display(){};

     //委托给行为类
     public void performQuack(){
          quackBehavior.quack();
     }

     //委托给行为类
     public void performFly(){
          flyBehavior.fly();
     }

     //在鸭子实例化过程中，可以绑定具体飞行方式
     public void setFlyBehavior(FlyBehavior fb){
          flyBehavior = fb;
     }

     //在鸭子实例化过程中，可以绑定具体发声方式
     public void setQuackBehavior(QuackBehavior qb){
          quackBehavior = qb;
     }
}
