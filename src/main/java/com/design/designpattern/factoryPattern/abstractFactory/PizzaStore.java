package com.design.designpattern.factoryPattern.abstractFactory;

/**
 * 抽象创建者类
 * 包含抽象的工厂方法，由子类实现具体创建细节。
 * 包含依赖于抽象产品的代码，并不知道具体产品类型。
 *
 * 工厂方法模式：
 *      定义了一个创建对象的接口，但由子类决定实例化的类是哪一个，
 *      工厂方法让类把实例化的过程推迟到子类。
 */
public abstract class PizzaStore {

    /**
     * 工厂方法-用于处理对象的创建，并将这样的行为封装在子类中，这样就可以使超类中的代码与子类中对象的创建解耦。
     * 工厂方法必须是抽象的，以便于子类对该方法进行实现
     * 工厂方法必须返回一个产品类型
     * 工厂方法可以根据实际情况判断是否需要参数。
     */
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();

        return pizza;
    }
}
