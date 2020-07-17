package com.example.wwg.controller;

import com.example.wwg.common.ResultData;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 20:00
 */
@Api(tags = "Usercontroller" ,description = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /**
     * 测试
     * @return
     */
    @GetMapping("/getUser")
    public List<User> getUser(){
        return userService.getUser();
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @ApiOperation("用户注册")
    @PostMapping("/register")
    public ResultData register(@RequestBody User user){
        return userService.register(user);
    }
    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public ResultData login(@RequestBody User user){
        return userService.login(user.getLoginName(),user.getPassword());
    }

}
