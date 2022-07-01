package com.designpatterns.flyweight;

public class App {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for(var point: service.getPoints())
            point.draw();
    }
}
