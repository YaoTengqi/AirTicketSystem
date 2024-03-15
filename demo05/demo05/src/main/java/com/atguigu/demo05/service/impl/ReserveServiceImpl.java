package com.atguigu.demo05.service.impl;

import com.atguigu.demo05.Bean.SeatSelect;
import com.atguigu.demo05.mapper.ReserveInfoMapper;
import com.atguigu.demo05.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveServiceImpl implements com.atguigu.demo05.service.ReserveService
{
    @Autowired
    ReserveInfoMapper reserveInfoMapper;

    @Override
    public void insertReserveInfoS(SeatSelect seatSelect) {
        reserveInfoMapper.insertReserveInfo(seatSelect);
    }
}
