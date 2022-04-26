package com.atguigu.spring.aopAnno;

import org.springframework.stereotype.Component;

/**
 * @author Davy
 */

@Component
public class User {
    public void add(){
        System.out.println("User 类的 add 方法被调用......");
    }
}
