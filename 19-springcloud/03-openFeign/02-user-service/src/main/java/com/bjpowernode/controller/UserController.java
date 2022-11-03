package com.bjpowernode.controller;

import com.bjpowernode.domain.Order;
import com.bjpowernode.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private UserOrderFeign userOrderFeign;

    @GetMapping("userDoOrder")
    public String userDoOrder(){
        System.out.println("有用户进来了");
        String s = userOrderFeign.doOrder();
        return s;
    }
    @GetMapping("testPara")
    public String testPara(){
        String result = userOrderFeign.testUrl("lizhijun", 24);
        System.out.println(result);

        String result1 =userOrderFeign.onePara("lizhijun");
        System.out.println(result1);

        String result3 = userOrderFeign.twoPara("lizhijun",24);
        System.out.println(result3);

        Order order = new Order(1,"lizhijun",34.0,new Date());
        String result4 = userOrderFeign.oneObj(order);

        String param = userOrderFeign.oneObjOnePara(order, "稽哥");
        System.out.println(param);

        System.out.println(result4);

        return "Ok";
    }
    @GetMapping("time")
    public String testTime(){
        Date date = new Date();
        String s = date.toString();
        String s1 = userOrderFeign.testDate(s);
        return "ok";
    }
}
