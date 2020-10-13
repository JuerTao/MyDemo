package com.microtao.service;

import com.microtao.entity.User;

/**
 * 注册、登录模块
 * */
public interface ILogingService {

    /**
     * 注册功能
     * */
    public int regist(User user);
    /**
     * 登录功能
     * */
    public int loggin(User user);
}
