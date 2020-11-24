package com.design.designpattern.factoryPattern.factoryMethod;

import com.design.designpattern.factoryPattern.factoryMethod.Pizza;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }


}
