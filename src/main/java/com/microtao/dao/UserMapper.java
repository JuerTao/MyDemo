package com.microtao.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.microtao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 於涛
 * @Date 2020/10/14-17:56
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
     User queryUserByUsername(@Param("userName") String userName);
}
