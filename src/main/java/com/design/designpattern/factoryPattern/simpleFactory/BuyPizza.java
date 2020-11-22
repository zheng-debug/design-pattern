package com.design.designpattern.factoryPattern.simpleFactory;

public class BuyPizza{

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("Veggie");
        System.out.println("简单工厂模式");
    }
}
