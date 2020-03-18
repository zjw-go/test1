package com.zjw.service.impl;

import com.zjw.dao.UserDao;
import com.zjw.entity.User;
import com.zjw.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void addNewUser(User user) {
        dao.save(user);
    }
}
