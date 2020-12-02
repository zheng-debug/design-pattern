package com.design.designpattern.singletonPattern;


public class Singleton {

    private static Singleton unqioInstance;

    private Singleton(){ }

    //未考虑多线程问题，当多个线程同时执行该方法，则可能产生多个实例对象。
    public static Singleton getInstance01(){
        if(unqioInstance == null){
            unqioInstance = new Singleton();
        }
        return unqioInstance;
    }

    //使用同步锁
    //每次调用该方法都需要进行同步，事实上只需要再第一次进行同步以后，之后的调用无需进行同步
    public static synchronized Singleton getInstance02(){
        if(unqioInstance == null){
            unqioInstance = new Singleton();
        }
        return unqioInstance;
    }

    //使用饿汉式单例
    private static Singleton unqioInstance01 = new Singleton();
    public static Singleton getInstance03(){
        return unqioInstance01;
    }

    //双重锁检查
    //第一次检查如果对象为空，则进行同步，并创建对象，之后调用方法则无需进行同步操作。
    public static Singleton getInstance04(){
        if (unqioInstance == null){
            synchronized (Singleton.class){
                if(unqioInstance == null){
                    unqioInstance = new Singleton();
                }
            }
        }
        return unqioInstance;
    }
}
