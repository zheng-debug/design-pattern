package com.design.designpattern.factoryPattern.simpleFactory;

/**
 * 使用简单工厂模式时，必须确定一个产品层次结构，
 * 将所有产品公共的代码移至抽象产品中。并声明一些抽象方法，以供不同的具体产品类实现。
 */
public abstract class Product {

    //产品公共方法
    public void productPublicMethod(){
        System.out.println("产品公共方法");
    }

    //产品业务方法
    public abstract void prodcutBusinessMethod();
}
