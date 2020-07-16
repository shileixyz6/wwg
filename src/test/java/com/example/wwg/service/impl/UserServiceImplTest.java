package com.example.wwg.service.impl;

import com.example.wwg.common.ResponseCode;
import com.example.wwg.common.ResultData;
import com.example.wwg.service.inter.UserService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-16 11:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    UserService userService;
    @org.junit.Test
    public void login() {
        ResultData resultData = new ResultData();
        resultData = userService.login("admin","123");
        Assert.assertEquals(ResponseCode.SUCCESS.getVal(),resultData.getCode());
    }
}