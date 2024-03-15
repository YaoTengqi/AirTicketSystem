package com.atguigu.demo05.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminView {
    private String airp_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date start_time;
    private String cust_name;
    private String cust_tel;
    private String cust_bid;
    private String seat_level;
    private String seat_id;
}
