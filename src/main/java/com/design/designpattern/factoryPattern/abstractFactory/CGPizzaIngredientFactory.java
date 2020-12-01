package com.design.designpattern.factoryPattern.abstractFactory;

public class CGPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public void createDough() {
        System.out.println("这是芝加哥面团");
    }

    @Override
    void createSauce() {
        System.out.println("这是芝加哥大酱");
    }

    @Override
    void createChees() {
        System.out.println("这是芝加哥芝士");
    }

    @Override
    void createClam() {
        System.out.println("这是是芝加哥蛤蜊");
    }
}
