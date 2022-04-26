package com.atguigu.spring.aopxml;

/**
 * @author Davy
 */
public class BookProxy {

    public void before(){
        System.out.println("BookProxy 类的 before 方法被调用了......");
    }
}
