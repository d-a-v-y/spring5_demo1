package com.atguigu.spring5;

/**
 * @author Davy
 */
public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.println("add......");
    }
}
