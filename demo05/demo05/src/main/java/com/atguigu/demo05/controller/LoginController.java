package com.atguigu.demo05.controller;

import com.atguigu.demo05.Bean.Customer;
import com.atguigu.demo05.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @ResponseBody
    @GetMapping("/cust")
    public Customer getAccByid(@RequestParam("id") String id) {
        return loginService.getCustByid(id);
    }

    @GetMapping("/login")
    public String loginPass(@RequestParam("logname") String id,
                            @RequestParam("logpass") String passwd,
                            HttpSession session) {
        Customer customer = loginService.getCustByid(id);

        if (passwd.equals(customer.getCust_passwd())) {
            session.setAttribute("userId", id);
            session.setAttribute("userPasswd", passwd);
            return "redirect:/main.html";
        } else {
            return "success";
        }
//        System.out.println(passwd);Id
    }

    @GetMapping("main.html")
    public String gotoMainPage(HttpSession session) {
        String id = (String) session.getAttribute("userId");
        Customer user = loginService.getCustByid(id);
        if (user != null && user.getActive_state() == 1) {
            session.setAttribute("userId", id);
            if (user.getCust_autho() == 1) {
                return "redirect:/success.html";
            } else {
                return "redirect:/success_admin.html";
            }
        } else if (user != null && user.getActive_state() == 0) {
            return "success";
            //这里应该提示请先激活！！！
        } else {
            return "success";
            //这里应该提示请先登录
        }
    }
}
