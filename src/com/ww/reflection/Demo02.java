package com.ww.reflection;

import com.ww.bean.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
    public static void main(String[] args) {
        String path = "com.ww.bean.User";
        try {
            Class user = Class.forName(path);
            System.out.println(user.getName());
            System.out.println(user.getSimpleName());
            Field[] fields = user.getFields();
            Field[] fields1 = user.getDeclaredFields();
            Field fie=user.getDeclaredField("userName");
            for (Field field : fields) {
                System.out.println("field:" + field);
            }

            for (Field field : fields1) {
                System.out.println("field:" + field);
            }
            Method[] method=user.getDeclaredMethods();
            Method m01=user.getMethod("getUserName",null);
            //如果方法有参数，则传递参数类型对应的class对象
            Method m02=user.getMethod("setUserId", String.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
