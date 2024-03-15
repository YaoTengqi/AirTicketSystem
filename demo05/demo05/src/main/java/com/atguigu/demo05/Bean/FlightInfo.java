package com.atguigu.demo05.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightInfo {
    private String f_id;
    private String airp_id;
    private String port_name;
    private String aircom_tel;
    private  String aircom_name;
    private  String start_pos;
    private  String dest_pos;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date start_time ;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date dest_time ;
    private int cust_cnt;
    private int economy_remain;
    private int first_remain;
    private  String fstate;
    private  String board_location;
    private  int cheap;
    private int expensive;
}