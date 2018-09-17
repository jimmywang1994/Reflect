package com.ww.reflection;

import com.ww.bean.User;

public class Demo01 {
    public static void main(String[] args) {
        String path = "com.ww.bean.User";
        try {
            Class user = Class.forName(path);
            Class user2 = User.class;
            Class user3 = path.getClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
