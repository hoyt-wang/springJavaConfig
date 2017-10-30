package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hoyt on 2017/10/30.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

   /* public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        userDao.save();
    }
}
