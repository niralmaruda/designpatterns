package com.designpatterns.Strategy;

public class JpegCpmpressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using jpeg");
    }
}
