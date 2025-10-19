package com.vonjy.springlab.annotation;

import com.vonjy.spring.annotation.UrlMapping;

public class TestClass {
    @UrlMapping(path="/url")
    private void methodWithAnnotation() {}

    @UrlMapping(path="/another-url")
    private void anotherMethodWithAnnotation() {}
}
