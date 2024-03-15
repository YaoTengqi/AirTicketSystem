package com.atguigu.demo05.service.impl;

import com.atguigu.demo05.Bean.FlightInfo;
import com.atguigu.demo05.mapper.FlightInfoMapper;
import com.atguigu.demo05.service.FlightInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FlightInfoServiceImpl implements com.atguigu.demo05.service.FlightInfoService {
    @Autowired
    FlightInfoMapper flightInfoMapper;

    @Override
    public ArrayList<FlightInfo> FlightInfoQueryS(String startPos, String endPos) {
        return flightInfoMapper.FlightInfoQuery(startPos, endPos);
    }
}
