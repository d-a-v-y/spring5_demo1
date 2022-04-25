package com.atguigu.spring.dao;

/**
 * @author Davy
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("UserDaoImpl 的 update 方法被调用");
    }
}
