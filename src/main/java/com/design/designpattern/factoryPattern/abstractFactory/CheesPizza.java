package com.design.designpattern.factoryPattern.abstractFactory;

public class CheesPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare(){
        pizzaIngredientFactory.createChees();
        pizzaIngredientFactory.createClam();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
    }
}
