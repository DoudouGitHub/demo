package com.example.demo.service.impl;

import com.example.demo.domain.OmsOrder;
import com.example.demo.mapper.OmsOrderMapper;
import com.example.demo.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class OmsOrderServiceImpl implements OmsOrderService {


    @Resource
    OmsOrderMapper omsOrderMapper;

    @Override
    public OmsOrder getOmsOrder(Integer omsOrderId) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(omsOrderId);
        return omsOrder;
    }
}
