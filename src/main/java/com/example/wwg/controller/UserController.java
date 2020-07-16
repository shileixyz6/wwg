package com.example.wwg.controller;

import com.example.wwg.common.ResultData;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 20:00
 */
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
