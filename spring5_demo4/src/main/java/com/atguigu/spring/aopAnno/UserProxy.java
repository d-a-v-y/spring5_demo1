package com.atguigu.spring.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Davy
 */

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* com.atguigu.spring.aopAnno.User.add(..))")
    public void before(){
        System.out.println("UserProxy 类的 before 方法被调用......");
    }
}
