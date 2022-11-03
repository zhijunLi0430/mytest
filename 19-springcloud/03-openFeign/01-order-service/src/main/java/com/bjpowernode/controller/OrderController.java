package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("doOrder")
    public String doOrder(){
        return "油条豆浆-热干面";
    }
}
