package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Davy
 */

//@Component(value="userService")
@Service
public class UserService {

    @Value(value="abc")
    private String name;

    /*@Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;*/

    @Resource(name="userDaoImpl1")
    private UserDao userDao;

    public void add(){
        System.out.println("Service add......"+name);
        userDao.add();
    }
}
