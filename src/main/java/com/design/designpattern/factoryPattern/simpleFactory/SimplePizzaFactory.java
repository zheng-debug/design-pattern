package com.design.designpattern.factoryPattern.simpleFactory;


/**
 * 简单工厂严格来说并不算做23种设计模式之一，它更像是一种编程习惯。目的是为了将生产类的过程封装起来，在需要新增类型的时候，
 * 不需要进入客户代码中进行改动，只需要对工厂类做出一定调整即可。
 *
 * 本类为创建工厂，是在本系统中唯一用到具体类的地方。
 */
public class SimplePizzaFactory {

    public Pizza cratePizza(String type){
        if("Veggie".equals(type)){
            return new VeggiePizza();
        }else if ("Chees".equals(type)){
            return new CheesPizza();
        }else if ("Clam".equals(type)){
            return new ClamPizza();
        }else {
            return new OriginalPizza();
        }
    }
}
