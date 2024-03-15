package com.atguigu.demo05.mapper;

import com.atguigu.demo05.Bean.FlightInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface FlightInfoMapper
{
   public ArrayList<FlightInfo> FlightInfoQuery(String startPos, String endPos );
}
