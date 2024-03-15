package com.atguigu.demo05.controller;

import com.atguigu.demo05.Bean.AdminFlight;
import com.atguigu.demo05.Bean.AdminView;
import com.atguigu.demo05.Bean.Aircom;
import com.atguigu.demo05.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;

    @RequestMapping("/success_admin.html")
    public String showCustInfo(@RequestParam(value = "airp_id", required = false) String airp_id, @RequestParam(value = "start_time", required = false) String start_time, @RequestParam(value = "cust_name", required = false) String cust_name, @RequestParam(value = "aircom_id", required = false) String aircom_id, ModelMap map, HttpSession session) {
        if (airp_id == null || start_time == null || cust_name == null || aircom_id == null) {
            List<AdminView> admin_list = adminService.getAllCustInfo();
            map.addAttribute("admin_list", admin_list);
        } else {
            List<AdminView> admin_list = adminService.getCustInfo(airp_id, start_time, cust_name, aircom_id);
            map.addAttribute("admin_list", admin_list);
        }
        List<Aircom> aircom_list = adminService.getAircom();
        map.addAttribute("aircom_list", aircom_list);

        return "success_admin";
    }


    @RequestMapping("/航班信息.html")
    public String showAllFlightInfo(@RequestParam(value = "airp_id", required = false) String airp_id, @RequestParam(value = "start_pos", required = false) String start_pos, @RequestParam(value = "dest_pos", required = false) String dest_pos, @RequestParam(value = "start_time", required = false) String start_time, @RequestParam(value = "aircom_id", required = false) String aircom_id, ModelMap map, HttpSession session) {
        if (airp_id == null || start_time == null || start_pos == null && dest_pos == null || aircom_id == null) {
            List<AdminFlight> admin_list_flight = adminService.getAllFilghtInfo();
            map.addAttribute("admin_list_flight", admin_list_flight);
        } else {
            List<AdminFlight> admin_list_flight = adminService.getFlightInfo(airp_id, start_pos, dest_pos, start_time, aircom_id);
            map.addAttribute("admin_list_flight", admin_list_flight);
        }

        List<Aircom> aircom_list = adminService.getAircom();
        map.addAttribute("aircom_list", aircom_list);
        return "航班信息";
    }

}
