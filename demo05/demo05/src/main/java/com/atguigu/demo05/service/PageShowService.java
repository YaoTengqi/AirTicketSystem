package com.atguigu.demo05.service;

import com.atguigu.demo05.Bean.Inovice;
import com.atguigu.demo05.Bean.SeatSelect;

import java.util.List;

public interface PageShowService {
    List<Inovice> orderQuery(String customer_id);

    public int getTotalPage();
}
