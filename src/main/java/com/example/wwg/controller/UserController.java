package com.example.wwg.controller;
import com.example.wwg.common.ResultData;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

import static com.example.wwg.common.constant.CURRENT_LOGIN_USER;
import static com.example.wwg.common.ResponseCode.SUCCESS;
import static com.example.wwg.common.constant.MESSAGE_LOGINOUT_SUCCESS;

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
    public ResultData login(@RequestBody User user, HttpSession session){
        ResultData resultData = userService.login(user.getLoginName(),user.getPassword());
        session.setAttribute(CURRENT_LOGIN_USER,resultData.getData());
        return resultData;
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @PostMapping("/logout")
    public ResultData logout(HttpSession session){
       session.removeAttribute(CURRENT_LOGIN_USER);
        ResultData resultData = new ResultData();
        resultData.setMsg(MESSAGE_LOGINOUT_SUCCESS);
        resultData.setCode(SUCCESS.getVal());
        return resultData;
    }
}
