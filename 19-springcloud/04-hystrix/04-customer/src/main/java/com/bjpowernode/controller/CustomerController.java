package com.bjpowernode.controller;

import com.bjpowernode.feign.CustomerRentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRentFeign customerRentFeign;

    @GetMapping("customerRent")
    public String customerRent(){
        String s = customerRentFeign.rentCar();
        return s;
    }
}
