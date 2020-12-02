package com.design.designpattern.factoryPattern.abstractFactory;

public class OriginalPizza extends Pizza {

    public PizzaIngredientFactory pizzaIngredientFactory;

    public OriginalPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        System.out.println("This is OriginalPizza");
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createChees();
        pizzaIngredientFactory.createClam();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
