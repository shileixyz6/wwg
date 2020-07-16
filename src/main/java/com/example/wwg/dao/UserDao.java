package com.example.wwg.dao;

import com.example.wwg.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 19:21
 */
@Mapper
public interface UserDao {
    /**
     * 测试
     * @return
     */
    List<User> getUser();

    /**
     * 根据loginName查询用户
     * @param loginName
     * @return
     */
    User getUserByLoginName(String loginName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
