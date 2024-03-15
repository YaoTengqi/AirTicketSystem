package com.atguigu.demo05.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String cust_id;
    private String cust_tel;
    private String cust_email;
    private String cust_name;
    private int cust_sex;
    private String cust_bid;
    private String cust_passwd;
    private String active_code;
    private int active_state;
    private int cust_autho;
}
