package com.bjpowernode.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String pwd;
    private Integer age;

    public User(Integer id, String name, String pwd, Integer age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }
}
