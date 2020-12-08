package com.design.designpattern.commandPattern;


public class SoundOnCommand implements Command{

    Sound sound;

    public SoundOnCommand(Sound sound){
        this.sound = sound;
    }

    @Override
    public void execcute() {
        sound.on();
        sound.setType("VCD");
        sound.setVolume(11);
    }

    @Override
    public void undo() {
        sound.off();
    }
}
