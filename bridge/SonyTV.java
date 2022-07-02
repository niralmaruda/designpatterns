package com.designpatterns.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turn On");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: turnOff");
    }
}
