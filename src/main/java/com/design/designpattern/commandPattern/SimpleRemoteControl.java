package com.design.designpattern.commandPattern;

public class SimpleRemoteControl {
    Command com;

    public void setCommand(Command command){
        com = command;
    }

    public void buttonWasPressed(){
        com.execcute();
    }
}
