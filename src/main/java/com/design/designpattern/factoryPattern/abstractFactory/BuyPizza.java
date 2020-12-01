package com.design.designpattern.factoryPattern.abstractFactory;


public class BuyPizza {

    public static void main(String[] args) {

        PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza("ChicagoClam");
        System.out.println("工厂方法");
    }
}
