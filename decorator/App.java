package com.designpatterns.decorator;

public class App {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCouldStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1324-3544-3454");
    }
}
