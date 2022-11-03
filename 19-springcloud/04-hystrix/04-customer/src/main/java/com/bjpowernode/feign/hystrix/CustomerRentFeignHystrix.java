package com.bjpowernode.feign.hystrix;

import com.bjpowernode.feign.CustomerRentFeign;
import org.springframework.stereotype.Component;

@Component
public class CustomerRentFeignHystrix implements CustomerRentFeign {
    @Override
    public String rentCar() {
        return "租车失败";
    }
}
