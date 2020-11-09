package com.example.demo.controller;

import com.example.demo.domain.OmsOrder;
import com.example.demo.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    OmsOrderService omsOrderService;

    @GetMapping("/getOrder")
    public OmsOrder getOrder(Integer orderId) {
        OmsOrder omsOrder = omsOrderService.getOmsOrder(orderId);
        return omsOrder;
    }

    @GetMapping
    public String getUser() {


        return "调用1";
    }

    @GetMapping("/test2")
    public String test2() {


        return "diaoyong2";
    }


    @GetMapping("/test3")
    public String test3() {


        return "test3";
    }
}
