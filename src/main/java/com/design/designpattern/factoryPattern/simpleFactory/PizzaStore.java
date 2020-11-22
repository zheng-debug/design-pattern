package com.design.designpattern.factoryPattern.simpleFactory;


public class PizzaStore {
    public SimplePizzaFactory simplePizzaFactory ;

    public PizzaStore(){
        this.simplePizzaFactory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.cratePizza(type);
        return pizza;
    }


}
