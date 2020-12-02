package com.design.designpattern.singletonPattern;

import org.junit.Test;


public class Test01 {

    @Test
    public void test01(){
        Singleton singleton = Singleton.getInstance01();
    }

    @Test
    public void test02(){
        Singleton singleton = Singleton.getInstance02();
    }

    @Test
    public void test03(){
        Singleton singleton = Singleton.getInstance03();
    }

    @Test
    public void test04(){
        Singleton singleton = Singleton.getInstance04();
        Singleton singleton1 = Singleton.getInstance01();
    }

}
