package com.design.designpattern.commandPattern;

/**
 * 简单遥控器调用
 */
public class Test01 {

    private static SimpleRemoteControl remote = new SimpleRemoteControl();

    public static void main(String[] args) {
        Light light = new Light();
        Command onLight = new LightOnCommand(light);
        remote.setCommand(onLight);
        remote.buttonWasPressed();
    }
}
