package com.microtao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 於涛
 * @Date 2020/10/13-10:30
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("1");
        return "index";
    }
}
