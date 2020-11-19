package com.design.designpattern.decoratePattern;

/**
 * 装饰者抽象类，集成被装饰者超类，是为了保证下级装饰者与被装饰者保持同一个类型，以便于包装操作。
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
