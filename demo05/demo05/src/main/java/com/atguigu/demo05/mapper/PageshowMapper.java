package com.atguigu.demo05.mapper;

import com.atguigu.demo05.Bean.Inovice;
import com.atguigu.demo05.Bean.SeatSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageshowMapper {
    public int findTotalCount(String order_id);

    public List<SeatSelect> findByPage(String order_id, int begin, int end);

    public int findTotalPage();

    public List<Inovice> findTotalOrder(String customer_id);

}
