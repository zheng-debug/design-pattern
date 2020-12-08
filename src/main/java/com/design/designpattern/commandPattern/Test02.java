package com.design.designpattern.commandPattern;

public class Test02 {

    private static RemoteControl remote = new RemoteControl();

    public static void main(String[] args) {
        Light light = new Light();
        Sound sound = new Sound();

        Command onLight = new LightOnCommand(light);
        Command offLight = new LightOffCommand(light);

        Command onSound = new SoundOnCommand(sound);
        Command offSound = new SoundOffCommand(sound);

        remote.setCommand(1, onLight, offLight);
        remote.setCommand(2, onSound, offSound);

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
    }
}
