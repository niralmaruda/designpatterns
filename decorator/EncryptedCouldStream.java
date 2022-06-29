package com.designpatterns.decorator;

public class EncryptedCouldStream implements Stream {
    private Stream stream;

    public EncryptedCouldStream(Stream stream) {
        this.stream = stream;
    }


    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "#$@%^@^&@!%^$^^&";
    }
}
