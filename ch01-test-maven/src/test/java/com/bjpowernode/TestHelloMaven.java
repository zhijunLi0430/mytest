package com.bjpowernode;

import com.bjpowernode.HelloMaven;
import junit.framework.Assert;
import org.junit.Test;

public class TestHelloMaven{
    @Test
    public void testAdd(){
        System.out.println("======testAdd测试add方法");
        HelloMaven hello=new HelloMaven();
        int res=hello.add(10,20);
        Assert.assertEquals(30,res);
    }
}