package com.ww.annotation;

import javafx.scene.control.Tab;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.security.cert.TrustAnchor;

/**
 * 使用反射读取注解信息
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.ww.annotation.Student");
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
            Table table = (Table) clazz.getAnnotation(Table.class);
            System.out.println(table.value());
            try {
                Field field = clazz.getDeclaredField("studentName");
                WWField wwField = field.getAnnotation(WWField.class);
                System.out.println(wwField.columnName() + "--" + wwField.type() + "--" + wwField.length());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
