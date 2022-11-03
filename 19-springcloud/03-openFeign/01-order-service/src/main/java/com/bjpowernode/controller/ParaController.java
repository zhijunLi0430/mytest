package com.bjpowernode.controller;

import com.bjpowernode.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class ParaController {

    @GetMapping("testUrl/{name}/and/{age}")
    public String testUrl(@PathVariable("name") String name,@PathVariable("age") Integer age){
        System.out.println(name + ":" + age);
        return "ok";
    }

    @GetMapping("onePara")
    public String onePara(@RequestParam(required = false) String name){
        System.out.println(name);
        return "ok";
    }
    @GetMapping("twoPara")
    public String twoPara(@RequestParam(required = false) String name,@RequestParam(required = false) Integer age){
        System.out.println(name);
        System.out.println(age);
        return "Ok";
    }
    @PostMapping("oneObj")
    public String oneObj(@RequestBody Order order){
        System.out.println(order);
        return "Ok";
    }
    @PostMapping("oneObjOnePara")
    public String oneObjOnePara(@RequestBody Order order,@RequestParam("name") String name){
        System.out.println(order);
        System.out.println(name);
        return "Ok";
    }

    @GetMapping("testTime")
    public String testDate(@RequestParam String date){
        System.out.println(date);
        return "Ok";
    }

}
