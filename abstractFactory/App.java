package com.designpatterns.abstractFactory;

import com.designpatterns.abstractFactory.ant.AntWidgetFactory;
import com.designpatterns.abstractFactory.app.ContactForm;
import com.designpatterns.abstractFactory.material.MaterialWidgetFactory;

public class App {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
