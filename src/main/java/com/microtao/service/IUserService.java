package com.microtao.service;

import com.microtao.entity.User;

/**
 * @Author 於涛
 * @Date 2020/10/12-18:13
 */
public interface IUserService {
    /**
     * 新增用户
     */
    public Boolean addUser();

    /**
     * 通过用户名删除用户
     */
    public Boolean delteteUser(String userName);

    /**
     * 修改用户信息
     */
    public User updateUser(User user);

    /**
     * 通过用户名查新用户信息
     */
    public User queryUser(String userName);

}
