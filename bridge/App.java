package com.designpatterns.bridge;

public class App {
    public static void main(String[] args) {
        var sonyRemote = new RemoteControl(new SonyTV());
        var samsungRemote = new AdvanceRemoteControl(new SamsungTV());
        sonyRemote.turnOn();
        samsungRemote.turnOff();
    }
}
