package com.design.designpattern.commandPattern;


public class NoCommand implements Command{

    public NoCommand(){
    }

    @Override
    public void execcute() {
        System.out.println("这是一个无用按钮");
    }

    @Override
    public void undo() {
        System.out.println("撤销操作");
    }
}
