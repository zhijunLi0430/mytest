package com.bjpowernode.feign;

import com.bjpowernode.feign.hystrix.CustomerRentFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "rent-car-service",fallback = CustomerRentFeignHystrix.class)
public interface CustomerRentFeign  {
    @GetMapping("rentCar")
    public String rentCar();
}
