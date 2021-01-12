package com.design.designpattern.factoryPattern.simpleFactory;

public class ProductB extends Product{

    public ProductB(){
        System.out.println("这是生产出来的产品B");
    }

    @Override
    public void prodcutBusinessMethod() {
        System.out.println("产品B业务方法");
    }
}
