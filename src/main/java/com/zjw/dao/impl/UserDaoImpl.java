package com.zjw.dao.impl;

import com.zjw.dao.UserDao;
import com.zjw.entity.User;

public class UserDaoImpl implements UserDao {

    public void save(User user) {
        System.out.println("保存用户信息" + user + "到数据库！！！！");
    }
}
