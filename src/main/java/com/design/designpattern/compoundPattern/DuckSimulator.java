package com.design.designpattern.compoundPattern;


/**
 * 鸭子模拟器
 */
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory){
        //抽象工厂模式+装饰者模式
        Quackable mallardDuck = factory.creatMallardDuck();
        Quackable redHeadDuck = factory.creatRedHeadDuck();
        Quackable rubberDuck = factory.creatRubberDuck();
        Quackable duckCall = factory.creatDuckCallDuck();
        //适配器模式
        Quackable goose = factory.creatGoose();

        //观察者模式
        Quackologist quackologist = new Quackologist();
        mallardDuck.registerObserver(quackologist);

        System.out.println("鸭子模拟器生产");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(goose);

        System.out.println("生产出来的鸭子加入鸭群中");
        //组合模式
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(rubberDuck);
        flock.add(duckCall);
        flock.add(goose);

        Quackable redHeadDuck01 = factory.creatRedHeadDuck();
        Quackable redHeadDuck02 = factory.creatRedHeadDuck();
        Quackable redHeadDuck03 = factory.creatRedHeadDuck();
        Quackable redHeadDuck04 = factory.creatRedHeadDuck();
        Quackable redHeadDuck05 = factory.creatRedHeadDuck();
        flock.add(redHeadDuck01);
        flock.add(redHeadDuck02);
        flock.add(redHeadDuck03);
        flock.add(redHeadDuck04);
        flock.add(redHeadDuck05);
        flock.quack();

        System.out.println("总共叫了：" + QuackCount.getQuackCount() + "声");
    }

    void simulate(Quackable quackable){
        quackable.quack();
    }
}
