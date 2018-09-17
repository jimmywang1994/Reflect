package com.ww.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //此处是参数，不是方法
    String studentName() default "";//默认值

}
