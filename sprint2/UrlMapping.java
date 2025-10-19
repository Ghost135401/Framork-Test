package com.vonjy.springlab.annotation;

import java.lang.reflect.Method;

import com.vonjy.spring.annotation.UrlMapping;

public class UrlMapping {

    /* 
     * Displays all the "UrlMapping.path()" values
     * from the methods of clazz
    */
    public static void displayAllUrlMappingPathValues(Class<?> clazz) throws SecurityException {
        try {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(UrlMapping.class)) {
                    UrlMapping annotation = method.getAnnotation(UrlMapping.class);
                    
                    StringBuilder sb = new StringBuilder();
                    sb.append("Method: ").append(method.getName()).append("()").append("; ")
                        .append("Path value from the annotation: ").append(annotation.path());

                    System.out.println(sb.toString());
                }
            }
        } catch (SecurityException se) {
            throw se;
        }
    }

}
