package com.microtao.service.impl;

import com.microtao.dao.UserMapper;
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
    private UserMapper userDao;

    @Override
    public Boolean addUser() {
        User user = new User();
        user.setUserName("xaioming");
        user.setPass_word("123456");
        Integer result = userDao.insert(user);
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
    public User queryUser(User user) {
        return userDao.queryUserByUsername(user.getUserName());
    }

}
