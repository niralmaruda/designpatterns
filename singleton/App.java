package com.designpatterns.singleton;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Niral");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
