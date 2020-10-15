package com.microtao.service.impl;

import com.microtao.dao.IUserDao;
import com.microtao.entity.User;
import com.microtao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 於涛
 * @Date 2020/10/12-18:28
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public Boolean addUser() {
        User user = new User();
        user.setUserName("xaioming");
        user.setPassword("123456");
        Integer result = userDao.insert(user);
        String test = new String();
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean delteteUser(String userName) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User queryUser(String userName) {
        return null;
    }

}
