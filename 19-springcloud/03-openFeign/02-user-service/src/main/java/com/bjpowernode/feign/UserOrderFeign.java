package com.bjpowernode.feign;

import com.bjpowernode.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@FeignClient(value = "order-service")
public interface UserOrderFeign {
    @RequestMapping("doOrder")
    public String doOrder();

    @GetMapping("testUrl/{name}/and/{age}")
    public String testUrl(@PathVariable("name") String name, @PathVariable("age") Integer age);

    @GetMapping("onePara")
    public String onePara(@RequestParam(required = false) String name);

    @GetMapping("twoPara")
    public String twoPara(@RequestParam(required = false) String name,@RequestParam(required = false) int age);

    @PostMapping("oneObj")
    public String oneObj(@RequestBody Order order);

    @PostMapping("oneObjOnePara")
    public String oneObjOnePara(@RequestBody Order order,@RequestParam("name") String name);

    @GetMapping("testTime")
    public String testDate(@RequestParam String date);
}
