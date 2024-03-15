package com.atguigu.demo05.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object loginUserId = session.getAttribute("userId");
//        System.out.println(loginUserId.toString());
        if(loginUserId != null)
        {
            return  true;
        }
        request.setAttribute("msg","您当前为未登录状态,请先登录!");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}
