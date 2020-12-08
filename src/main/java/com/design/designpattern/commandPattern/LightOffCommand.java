package com.design.designpattern.commandPattern;


public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execcute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
