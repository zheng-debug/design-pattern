package com.design.designpattern.compoundPattern;

/**
 * 创建工厂生产鸭子
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable creatRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable creatRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable creatMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable creatDuckCallDuck() {
        return new DuckCall();
    }

    @Override
    public Quackable creatGoose() {
        return new GooseAdapter(new Goose());
    }
}
