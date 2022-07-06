package com.designpatterns.factory.macha;

import java.util.Map;

public class MachaViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View render by Matcha!";
    }
}
