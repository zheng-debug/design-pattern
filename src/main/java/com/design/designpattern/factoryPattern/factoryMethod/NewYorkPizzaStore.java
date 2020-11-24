package com.design.designpattern.factoryPattern.factoryMethod;

import com.design.designpattern.factoryPattern.factoryMethod.*;
import com.design.designpattern.factoryPattern.factoryMethod.Pizza;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("NewYorkCheesPizza".equals(type)){
            return new NewYorkCheesPizza();
        }else {
            return new OriginalPizza();
        }
    }
}
