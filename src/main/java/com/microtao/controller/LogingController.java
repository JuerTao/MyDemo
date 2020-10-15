package com.microtao.controller;

import com.microtao.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 於涛
 * @Date 2020/10/15-14:16
 */
@Controller
public class LogingController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
