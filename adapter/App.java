package com.designpatterns.adapter;

import com.designpatterns.adapter.avaFilters.Caramel;

public class App {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelAdapter(new Caramel()));
    }
}
