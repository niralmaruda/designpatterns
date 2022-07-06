package com.designpatterns.factory.macha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
