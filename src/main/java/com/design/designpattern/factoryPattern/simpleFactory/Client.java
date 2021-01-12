package com.design.designpattern.factoryPattern.simpleFactory;


/**
 * 客户端调用工厂生产产品代码
 */
public class Client {
    public static void main(String[] args) {
        Product product;
        product = SimpleFactoryProduct.crateProduct("A");
        product.prodcutBusinessMethod();
        product.productPublicMethod();
    }
}
