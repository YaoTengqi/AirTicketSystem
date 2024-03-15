package com.atguigu.demo05.service;

import com.atguigu.demo05.Bean.FlightInfo;

import java.util.ArrayList;

public interface FlightInfoService {
    public ArrayList<FlightInfo> FlightInfoQueryS(String startPos, String endPos );
}
