package com.designpatterns.factory;

import com.designpatterns.factory.macha.Controller;
import com.designpatterns.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get Products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }
}
