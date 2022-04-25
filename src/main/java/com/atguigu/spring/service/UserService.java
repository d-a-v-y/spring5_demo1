package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;

/**
 * @author Davy
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService 的 add 方法被调用");
        userDao.update();
    }
}
