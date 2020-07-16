package com.example.wwg.service.impl;

import com.example.wwg.common.ResultData;
import com.example.wwg.dao.UserDao;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import static com.example.wwg.common.ResponseCode.ERROR;
import static com.example.wwg.common.ResponseCode.SUCCESS;
import static com.example.wwg.common.constant.*;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 19:58
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    /**
     * 测试
     * @return
     */
    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public ResultData register(User user) {
        ResultData resultData = new ResultData();
        //loginName不能重复
        User user1 = userDao.getUserByLoginName(user.getLoginName());
        if(user1 != null){
            resultData.setMsg(MESSAGE_LOGIN_ACCT_ALREADY_IN_USE);
            resultData.setCode(ERROR.getVal());
            return resultData;
        }
        int count = userDao.addUser(user);
        if(count == 0){
            resultData.setMsg(MESSAGE_REGISTER_FAILED);
            resultData.setData(ERROR.getVal());
            return resultData;
        }
        resultData.setMsg(MESSAGE_REGISTER_SUCCESS);
        resultData.setData(SUCCESS.getVal());
        return resultData;
    }
    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    @Override
    public ResultData login(String userName, String password) {
        User user = userDao.getUserByLoginName(userName);
        ResultData resultData = new ResultData();
        if(user == null){
            resultData.setMsg(MESSAGE_LOGIN_FAILED);
            resultData.setCode(ERROR.getVal());
            return resultData;
        }
        if(!user.getPassword().equals(password)){
            resultData.setMsg(MESSAGE_LOGIN_FAILED);
            resultData.setCode(ERROR.getVal());
            return resultData;
        }
        user.setPassword("");
        resultData.setMsg(MESSAGE_LOGIN_SUCCESS);
        resultData.setCode(SUCCESS.getVal());
        resultData.setData(user);
        return resultData;
    }
}
