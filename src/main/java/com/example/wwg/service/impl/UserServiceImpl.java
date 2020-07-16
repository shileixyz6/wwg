package com.example.wwg.service.impl;

import com.example.wwg.common.ResponseCode;
import com.example.wwg.common.ResultData;
import com.example.wwg.common.constant;
import com.example.wwg.dao.UserDao;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import static com.example.wwg.common.ResponseCode.ERROR;
import static com.example.wwg.common.ResponseCode.SUCCESS;
import static com.example.wwg.common.constant.MESSAGE_LOGIN_FAILED;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 19:58
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
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
        resultData.setMsg(SUCCESS.getMsg());
        resultData.setCode(SUCCESS.getVal());
        resultData.setData(user);
        return resultData;
    }
}
