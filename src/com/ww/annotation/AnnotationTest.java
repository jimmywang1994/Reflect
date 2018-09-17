package com.ww.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @MyAnnotation(studentName = "ww")
    public static void test02(){
        List list=new ArrayList();
    }
}
