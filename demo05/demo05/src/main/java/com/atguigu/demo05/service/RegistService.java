package com.atguigu.demo05.service;

import com.atguigu.demo05.Bean.Customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RegistService {
    public Customer addCust(String id, String email, String passwd, String active_code);

    public Customer activeCust(String code);

    public void updateState(String id);
}
