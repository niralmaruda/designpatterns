package com.designpatterns.abstractFactory.app;

import com.designpatterns.abstractFactory.Theme;
import com.designpatterns.abstractFactory.WidgetFactory;
import com.designpatterns.abstractFactory.ant.AntButton;
import com.designpatterns.abstractFactory.ant.AntTextBox;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    };
}
