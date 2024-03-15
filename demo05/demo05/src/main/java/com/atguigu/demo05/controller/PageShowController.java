package com.atguigu.demo05.controller;

import com.atguigu.demo05.Bean.Inovice;
import com.atguigu.demo05.Bean.SeatSelect;
import com.atguigu.demo05.service.impl.PageShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PageShowController {
    @Autowired
    PageShowServiceImpl pageShowService;


    @RequestMapping("/订单管理.html")
    public String pageQuery(ModelMap map, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        List<Inovice> invoice_list = pageShowService.orderQuery(userId);//返回某一用户所有的订单

        map.addAttribute("invoice_list", invoice_list);

        return "订单管理";
    }
}
