package com.microtao.controller;

import com.microtao.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 於涛
 * @Date 2020/10/15-14:16
 */
@Controller
@RequestMapping("/login")
public class LogingController {
    @RequestMapping("/log")
    public String login() {
        return "login";
    }
}
