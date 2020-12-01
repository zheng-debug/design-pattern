package com.design.designpattern.factoryPattern.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    public PizzaIngredientFactory pizzaIngredientFactory = new CGPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        if ("ChicagoClam".equals(type)){
            return new CheesPizza(pizzaIngredientFactory);
        }else {
            return new OriginalPizza();
        }
    }
}
