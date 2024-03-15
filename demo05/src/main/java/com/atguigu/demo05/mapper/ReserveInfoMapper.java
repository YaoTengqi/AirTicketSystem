package com.atguigu.demo05.mapper;

import com.atguigu.demo05.Bean.SeatSelect;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveInfoMapper {
    public void insertReserveInfo( SeatSelect seatSelect);
}
