package com.design.designpattern.factoryPattern.simpleFactory;

/**
 * 具体产品类中实现了抽象产品类定义的抽象方法，不同的产品有不同的实现
 */
public class ProductA extends Product{

    public ProductA(){
        System.out.println("这是生产出来的产品A");
    }

    @Override
    public void prodcutBusinessMethod() {
        System.out.println("产品A业务方法");
    }
}
