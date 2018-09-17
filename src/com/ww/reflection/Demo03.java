package com.ww.reflection;

import com.ww.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo03 {
    public static void main(String[] args) {
        String path = "com.ww.bean.User";
        try {
            Class<User> user = (Class<User>) Class.forName(path);
            //通过反射动态调用构造方法，构造对象
            User user1= (User) user.newInstance();//调用了无惨构造方法
            Constructor<User> c=user.getDeclaredConstructor(String.class,String.class);
            User user2=c.newInstance("ww","123");
            System.out.println(user1);
            System.out.println(user2.getUserName());

            User user3= (User) user.newInstance();
            Method method=user.getDeclaredMethod("setUserName", String.class);
            method.invoke(user3,"wwei");
            System.out.println(user3.getUserName());

            User user4=user.newInstance();
            Field field= user.getDeclaredField("userName");
            field.setAccessible(true);
            field.set(user4,"wwei5");
            System.out.println(user4.getUserName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
