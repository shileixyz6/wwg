package com.example.wwg.model;

import lombok.Data;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-15 19:12
 */
@Data
public class User {
    private Integer userId;
    private String loginName;
    private String userName;
    private String email;
    private String phoneNumber;
    private char sex;
    private String password;
    private String salt;
}
