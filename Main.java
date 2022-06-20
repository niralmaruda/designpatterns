package com.designpatterns;

import com.designpatterns.Stratergy.BlackAndWhiteFilter;
import com.designpatterns.Stratergy.ImageStorage;
import com.designpatterns.Stratergy.JpegCpmpressor;
import com.designpatterns.Stratergy.PngCompressor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new JpegCpmpressor(), new BlackAndWhiteFilter());
    }
}
