package com.microtao.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * 用户实体类
 *
 * @Author 於涛
 * @Date 2020/10/12-18:20
 */
@Data
@TableName(value = "t_user")
public class User {
    @TableId(value = "id")
    private int id;
    @TableField(value = "user_name",exist = true)
    private String userName;
    private String password;
}
