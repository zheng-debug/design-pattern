package com.design.designpattern.factoryPattern.factoryMethod;

/**
 * 具体产品B
 * 继承抽象产品，并实现抽象产品中定义的抽象方法。
 */
public class ProductB extends Product {

    @Override
    public void wirteProduct() {
        System.out.println("这是产品B");
    }
}
