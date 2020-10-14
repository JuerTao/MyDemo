package com.microtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 於涛
 * @Date 2020/10/12-18:09
 */
@Controller
@RequestMapping("/user")
public class AddUserController {

    @RequestMapping("/addUser")
    public String addUser(){
        System.out.println("111111111111111111");
        return "index";
    }
}
