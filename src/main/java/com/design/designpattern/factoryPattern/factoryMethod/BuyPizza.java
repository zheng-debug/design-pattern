package com.design.designpattern.factoryPattern.factoryMethod;


public class BuyPizza {

    public static void main(String[] args) {

        PizzaStore store = new NewYorkPizzaStore();
        Pizza pizza = store.createPizza("NewYorkCheesPizza");
        System.out.println("工厂方法");
    }
}
