package com.atguigu.demo05.controller;

import com.atguigu.demo05.Bean.Customer;
import com.atguigu.demo05.mapper.CustormerMapper;
import com.atguigu.demo05.service.impl.RegistServiceImpl;
import com.atguigu.demo05.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Controller
public class RegistController {
    @Autowired
    RegistServiceImpl registService;

    @Autowired
    CustormerMapper custormerMapper;

    @GetMapping("/regist")
    public String regist(@RequestParam("logname") String id,
                         @RequestParam("logemail") String email,
                         @RequestParam("logpass") String passwd) {

        Customer customer = custormerMapper.getCust(id);

        if (customer == null)//用户不存在
        {
            //若用户名不存在，则待用户激活后将信息入库
            String active_code = UUID.randomUUID().toString().replace("-", "");
            System.out.println(active_code);
            customer = registService.addCust(id, email, passwd, active_code);
            String content = "<a href=http://localhost:8080/active?code=" + customer.getActive_code() + ">" + id + "您好，点击激活</a>";
            MailUtils.sendMail(email, content, "激活邮件");
        }
        return "success";

    }

    @GetMapping("/active")
    public void active(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("code");
        Customer active_customer = registService.activeCust(code);
        String msg = null;//返回提示信息
        if (active_customer != null)//邮箱验证成功，则将用户信息入库
        {
            registService.updateState(active_customer.getCust_id());
            msg = "激活成功，请<a href='/'>登录</a>";
        } else {
            msg = "激活失败，请联系管理员!(3079763131@qq.com)";
        }
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
