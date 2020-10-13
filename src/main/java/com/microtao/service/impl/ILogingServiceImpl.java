package com.microtao.service.impl;

import com.microtao.dao.UserDao;
import com.microtao.entity.User;
import com.microtao.service.ILogingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 登录、注册模块
 * */
public class ILogingServiceImpl implements ILogingService {

    @Autowired
    private UserDao userDao;
    @Override
    public int regist(User user) {
        return 0;
    }

    @Override
    public int loggin(User user) {
        return 0;
    }
}
