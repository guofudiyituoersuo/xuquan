package com.xu.service.impl;

import com.xu.dao.UserDao;
import com.xu.po.User;
import com.xu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUsers() {
        List<User> users = userDao.findAll();
        return users;
    }
}
