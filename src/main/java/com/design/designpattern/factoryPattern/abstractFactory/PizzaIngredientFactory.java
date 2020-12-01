package com.design.designpattern.factoryPattern.abstractFactory;


/**
 * 披萨原料工厂-抽象工厂
 */
public abstract class PizzaIngredientFactory {

    //创建面团
    public abstract void createDough();

    //创建酱油
    abstract void createSauce();

    //创建芝士
    abstract void createChees();

    //创建蛤蜊
    abstract void createClam();
}
