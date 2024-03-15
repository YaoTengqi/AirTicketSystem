package com.atguigu.demo05.mapper;

import com.atguigu.demo05.Bean.AdminFlight;
import com.atguigu.demo05.Bean.AdminView;
import com.atguigu.demo05.Bean.Aircom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    public List<AdminView> getCustInfo(String airp_id, String start_time, String cust_name, String aircom_id);

    public List<AdminView> getAllCustInfo();

    public List<AdminFlight> getAllFilghtInfo();


    public void changeCustInfo();

    public List<AdminFlight> getFlightInfo(String airp_id, String start_pos, String dest_pos, String start_time, String aircom_id);

    public List<Aircom> getAircom();
}
