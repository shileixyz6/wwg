package com.example.wwg.dao.mapper;

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
    List<User> getUser();
}
