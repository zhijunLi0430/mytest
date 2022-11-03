package com.bjpowernode.controller;

import com.bjpowernode.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.UUID;

@RestController
public class LoginController {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("doLogin")
    public String doLogin(String name,String pwd){
        System.out.println(name);
        System.out.println(pwd);
        User user = new User(1, name, pwd, 18);
        String token=UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(token, user.toString(), Duration.ofSeconds(7200));
        return token;
    }
}
