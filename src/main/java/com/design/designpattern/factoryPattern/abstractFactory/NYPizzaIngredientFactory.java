package com.design.designpattern.factoryPattern.abstractFactory;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public void createDough() {
        System.out.println("这是纽约面团");
    }

    @Override
    void createSauce() {
        System.out.println("这是纽约大酱");
    }

    @Override
    void createChees() {
        System.out.println("这是纽约芝士");
    }

    @Override
    void createClam() {
        System.out.println("这是纽约蛤蜊");
    }
}
