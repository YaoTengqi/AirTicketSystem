package com.atguigu.demo05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageController {

    /**
     * 去到page.html页面
     *
     * @return
     */
    @RequestMapping("/{page}")
    public String toPage(@PathVariable String page) {
        return page;
    }
}