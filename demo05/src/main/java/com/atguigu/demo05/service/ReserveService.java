package com.atguigu.demo05.service;

import com.atguigu.demo05.Bean.SeatSelect;
import org.springframework.stereotype.Service;

@Service
public interface ReserveService {
    public void insertReserveInfoS(SeatSelect seatSelect);
}

