package com.design.designpattern.factoryPattern.factoryMethod;

/**
 * 具体产品A
 * 继承抽象产品，并实现抽象产品中定义的抽象方法。
 */
public class ProductA extends Product {

    @Override
    public void wirteProduct() {
        System.out.println("这是产品A");
    }
}
