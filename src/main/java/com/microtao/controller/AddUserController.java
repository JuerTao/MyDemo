package com.microtao.controller;

import com.microtao.entity.User;
import com.microtao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.HashMap;

/**
 * @Author 於涛
 * @Date 2020/10/12-18:09
 */
@Controller
@RequestMapping("/user")
public class AddUserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/validate")
    public ModelAndView validateLogin(@RequestParam(name = "username") String userName,
                                @RequestParam(name = "password") String password,
                                @RequestParam(name = "Captcha") String captcha) {
        User user = new User();
        user.setUserName(userName);
        user.setPass_word(password);
        User userDB = userServiceImpl.queryUser(user);
        System.out.println(userDB.toString());
        ModelAndView modelAndView = new ModelAndView();
        if (null == userDB) {
            modelAndView.addObject("message","登录失败");
            modelAndView.setViewName("login");
            return modelAndView;
        }else{
            modelAndView.setViewName("welcome");
               return modelAndView;
        }
    }
}
