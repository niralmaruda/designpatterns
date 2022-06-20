package com.designpatterns;

import com.designpatterns.Strategy.BlackAndWhiteFilter;
import com.designpatterns.Strategy.ImageStorage;
import com.designpatterns.Strategy.JpegCpmpressor;
import com.designpatterns.Strategy.PngCompressor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new JpegCpmpressor(), new BlackAndWhiteFilter());
    }
}
