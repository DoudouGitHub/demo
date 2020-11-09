package com.example.demo.mapper;

import com.example.demo.domain.OmsOrder;
import org.springframework.stereotype.Component;

public interface OmsOrderMapper {
    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Integer omsOrderId);
}