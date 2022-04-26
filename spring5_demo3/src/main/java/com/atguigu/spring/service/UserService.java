package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Davy
 */

@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;

    @Value(value = "一二三")
    private String name;

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    public void add(){
        System.out.println("UserService 的 add 方法被调用"+name);
        userDao.add();
    }

}
