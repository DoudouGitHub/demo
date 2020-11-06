package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser() {


        return "调用";
    }

    @GetMapping("/test2")
    public String test2() {


        return "diaoyong2";
    }
}
