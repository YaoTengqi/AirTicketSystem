package com.atguigu.demo05.service.impl;

import com.atguigu.demo05.Bean.Customer;
import com.atguigu.demo05.mapper.CustormerMapper;
import com.atguigu.demo05.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Service
public class RegistServiceImpl implements com.atguigu.demo05.service.RegistService {
    @Autowired
    CustormerMapper custormerMapper;

    public Customer addCust(String id, String email, String passwd, String active_code) {
        custormerMapper.addCust(id, email, passwd, active_code);
        Customer customer = custormerMapper.getCust(id);
        return customer;
    }

    @Override
    public Customer activeCust(String code) {
        Customer customer = custormerMapper.getCustByCode(code);
        return customer;
    }

    @Override
    public void updateState(String id) {
        custormerMapper.updateState(id);
    }
}
