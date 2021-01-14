package com.design.designpattern.factoryPattern.factoryMethod;


public class Client {

    public static void main(String[] args) {
        //通过工厂A生产产品A
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.creteProduct();
        productA.wirteProduct();

        //通过工厂B生产产品B
        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.creteProduct();
        productB.wirteProduct();
        System.out.println("工厂方法");
    }
}
