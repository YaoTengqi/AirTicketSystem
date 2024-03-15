package com.atguigu.demo05.service.impl;

import com.atguigu.demo05.Bean.Inovice;
import com.atguigu.demo05.Bean.SeatSelect;
import com.atguigu.demo05.mapper.PageshowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageShowServiceImpl implements com.atguigu.demo05.service.PageShowService {
    @Autowired
    PageshowMapper pageshowMapper;

    @Override
    public List<Inovice> orderQuery(String customer_id) {
        List<Inovice> list_order = pageshowMapper.findTotalOrder(customer_id);
        return list_order;
    }

    @Override
    public int getTotalPage() {
        return pageshowMapper.findTotalPage();
    }
}
