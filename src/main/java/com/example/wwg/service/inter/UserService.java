package com.example.wwg.service.inter;

import com.example.wwg.common.ResultData;
import com.example.wwg.model.User;

import java.util.List;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 19:57
 */
public interface UserService {
    /**
     * 测试
     * @return
     */
    List<User> getUser();

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    ResultData login(String userName,String password);

    /**
     * 注册
     * @param user
     * @return
     */
    ResultData register(User user);
}
