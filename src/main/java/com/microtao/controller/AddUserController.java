package com.microtao.controller;

import com.microtao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 於涛
 * @Date 2020/10/12-18:09
 */
@Controller
@RequestMapping("/user")
public class AddUserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/addUser")
    public String addUser(){
        ModelAndView view = new ModelAndView();
        userServiceImpl.addUser();
        return "index";
    }
}
