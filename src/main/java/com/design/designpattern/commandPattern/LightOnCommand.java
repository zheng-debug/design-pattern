package com.design.designpattern.commandPattern;


public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execcute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
