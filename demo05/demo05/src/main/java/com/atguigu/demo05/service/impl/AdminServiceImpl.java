package com.atguigu.demo05.service.impl;

import com.atguigu.demo05.Bean.AdminFlight;
import com.atguigu.demo05.Bean.AdminView;
import com.atguigu.demo05.Bean.Aircom;
import com.atguigu.demo05.mapper.AdminMapper;
import com.atguigu.demo05.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<AdminView> getCustInfo(String airp_id, String start_time, String cust_name, String aircom_id) {
        return adminMapper.getCustInfo(airp_id, start_time, cust_name, aircom_id);
    }

    @Override
    public List<AdminView> getAllCustInfo() {
        return adminMapper.getAllCustInfo();
    }


    @Override
    public List<AdminFlight> getAllFilghtInfo() {
        return adminMapper.getAllFilghtInfo();
    }

    @Override
    public List<AdminFlight> getFlightInfo(String airp_id, String start_pos, String dest_pos, String start_time, String aircom_id) {
        return adminMapper.getFlightInfo(airp_id, start_pos, dest_pos, start_time, aircom_id);
    }

    @Override
    public void changeCustInfo() {

    }

    @Override
    public List<Aircom> getAircom() {
        return adminMapper.getAircom();
    }
}
