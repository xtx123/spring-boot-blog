package com.buct.blog.service;

import com.buct.blog.dao.UserDao;
import com.buct.blog.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<user> login(String username, String password){return userDao.login(username,password);}
}
