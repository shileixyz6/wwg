package com.example.wwg.service.impl;

import com.example.wwg.dao.mapper.UserDao;
import com.example.wwg.model.User;
import com.example.wwg.service.inter.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
}
