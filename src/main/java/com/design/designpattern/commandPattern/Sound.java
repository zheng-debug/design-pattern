package com.design.designpattern.commandPattern;

public class Sound {

    private String type = "CD";
    private int volume = 10;

    public Sound() {
    }

    public Sound(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void on(){
        System.out.println("打开音响");
    }

    public void off(){
        System.out.println("关闭音响");
    }
}
