package com.design.designpattern.commandPattern;


public class SoundOffCommand implements Command{

    Sound sound;

    public SoundOffCommand(Sound sound){
        this.sound = sound;
    }

    @Override
    public void execcute() {
        sound.off();
    }

    @Override
    public void undo() {
        sound.on();
    }
}
