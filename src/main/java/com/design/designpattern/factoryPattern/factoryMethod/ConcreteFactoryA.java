package com.design.designpattern.factoryPattern.factoryMethod;


/**
 * 具体工厂A
 * 继承抽象工厂并实现创建产品方法。
 */
public class ConcreteFactoryA extends Factory {

    @Override
    public Product creteProduct() {
        Product prodcut = new ProductA();
        return prodcut;
    }
}
