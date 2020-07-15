package com.example.wwg.controller;

import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("/getUser")
    public List<User> getUser(){
        return userService.getUser();
    }

}
