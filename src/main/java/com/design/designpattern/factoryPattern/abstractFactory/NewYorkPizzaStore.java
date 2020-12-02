package com.design.designpattern.factoryPattern.abstractFactory;

public class NewYorkPizzaStore extends PizzaStore {
    public PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {

        if ("NewYorkCheesPizza".equals(type)){
            return new CheesPizza(pizzaIngredientFactory);
        }else {
            return new OriginalPizza(pizzaIngredientFactory);
        }
    }
}
