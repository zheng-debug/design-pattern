package com.design.designpattern.compoundPattern;

/**
 * 叫声次数鸭子工厂
 *     在生产鸭子的同时，使用装饰者模式对生产的鸭子进行装饰，使之具有记录叫声的能力。
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable creatRubberDuck() {
        return new QuackCount(new RubberDuck());
    }

    @Override
    public Quackable creatRedHeadDuck() {
        return new QuackCount(new RedHeadDuck());
    }

    @Override
    public Quackable creatMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable creatDuckCallDuck() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable creatGoose() {
        return new QuackCount(new GooseAdapter(new Goose()));
    }
}
