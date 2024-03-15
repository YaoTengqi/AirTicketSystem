package com.atguigu.demo05.controller;

import com.atguigu.demo05.Bean.FlightInfo;
import com.atguigu.demo05.service.FlightInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Date;

@Controller
public class SearchController {
    @Autowired
    FlightInfoService flightInfoService;

    @GetMapping("/searchticket")
    public String queryFlightInfo(@RequestParam("beginplace") String beginplace,
                            @RequestParam("endplace") String endplace,
                            @RequestParam("begindate") String begindate,
                                  @RequestParam("backdate") String backdatedate,
                            @RequestParam("adultnum") int adultnum,
                            @RequestParam("childnum") int childnum,
                                  @RequestParam("type") String type,
                                  HttpSession session,
                                  Model model) {

        Collection<FlightInfo> flightInfos  =  flightInfoService.FlightInfoQueryS(beginplace,endplace);
        model.addAttribute("flightInfos",flightInfos);
        return  "航班查询";

    }
}
