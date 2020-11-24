package com.design.designpattern.factoryPattern.factoryMethod;

import com.design.designpattern.factoryPattern.factoryMethod.Pizza;
import com.design.designpattern.factoryPattern.factoryMethod.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("ChicagoClam".equals(type)){
            return new ChicagoClamPizza();
        }else {
            return new OriginalPizza();
        }
    }
}
