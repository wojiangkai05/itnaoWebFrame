package com.itnao.service.impl;

import com.itnao.dao.UserDao;
import com.itnao.model.User;
import com.itnao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 凯 on 2016/11/10.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public List<User> findUser() {
        return userDao.getUser();
    }
}
