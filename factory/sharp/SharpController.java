package com.designpatterns.factory.sharp;

import com.designpatterns.factory.macha.Controller;
import com.designpatterns.factory.macha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
