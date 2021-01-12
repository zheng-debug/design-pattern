package com.design.designpattern.factoryPattern.simpleFactory;

public class ProductC extends Product{

    public ProductC(){
        System.out.println("这是生产出来的产品C");
    }

    @Override
    public void prodcutBusinessMethod() {
        System.out.println("产品C业务方法");
    }
}
