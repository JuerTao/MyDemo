package com.microtao.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.microtao.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 於涛
 * @Date 2020/10/14-17:56
 */
@Mapper
public interface IUserDao extends BaseMapper<User> {
}
