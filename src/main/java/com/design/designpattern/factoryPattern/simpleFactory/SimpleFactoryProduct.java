package com.design.designpattern.factoryPattern.simpleFactory;


/**
 * 简单工厂严格来说并不算做23种设计模式之一，它更像是一种编程习惯。目的是为了将生产类的过程封装起来，在需要新增类型的时候，
 * 不需要进入客户代码中进行改动，只需要对工厂类做出一定调整即可。
 * 工厂类中提供了一个静态工厂方法供客户端调用，客户端无需创建工厂实例
 * 本类为创建工厂，是在本系统中唯一用到具体类的地方。
 */
public class SimpleFactoryProduct {

    public static Product crateProduct(String type){
        if("A".equals(type)){
            return new ProductA();
        }else if ("B".equals(type)){
            return new ProductB();
        }else if ("C".equals(type)){
            return new ProductC();
        }else {
            return null;
        }
    }
}
