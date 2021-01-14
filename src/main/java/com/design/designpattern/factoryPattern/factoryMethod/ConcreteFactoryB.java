package com.design.designpattern.factoryPattern.factoryMethod;


/**
 * 具体工厂B
 * 继承抽象工厂并实现创建产品方法。
 */
public class ConcreteFactoryB extends Factory {

    @Override
    public Product creteProduct() {
        Product product = new ProductB();
        return product;
    }
}
