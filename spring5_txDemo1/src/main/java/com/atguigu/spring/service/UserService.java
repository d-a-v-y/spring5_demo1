package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Davy
 */

@Service
@Transactional(readOnly = false, timeout = 5, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class UserService {

    //注入DAO
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
        userDao.reduceMoney();

        userDao.addMoney();
    }
}
