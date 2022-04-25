package com.atguigu.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Davy
 */
@Repository(value = "userDaoImpl")//默认这样写，所以可以省略。
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("UserDaoImpl 的 add 方法被调用");
    }
}
