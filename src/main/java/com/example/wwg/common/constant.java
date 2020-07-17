package com.example.wwg.common;/**
 * @Author : xiao
 * @Date : 2020/7/16 9:55
 */

/**
 * @program: wwg
 * @description: 返回常量
 * @author: Mr.Xiao
 * @create: 2020-07-16 09:55
 **/
public class constant {
    public static final String MESSAGE_LOGIN_FAILED = "账号或密码错误，请重新登录";
    public static final String MESSAGE_LOGIN_SUCCESS = "登录成功";
    public static final String MESSAGE_LOGIN_ACCT_ALREADY_IN_USE ="您要注册的用户已存在";
    public static final String MESSAGE_REGISTER_SUCCESS = "注册成功";
    public static final String MESSAGE_REGISTER_FAILED = "注册失败";
    public static final String MESSAGE_CODE_INVALID = "明文非有效密码,请核对后再试";
    public static final String MESSAGE_ACCESS_DENIED = "请登录后再试";

    public static final Map<String,String> EXCEPTION_MESSAGE_MAP=new HashMap<>();

    static {
        EXCEPTION_MESSAGE_MAP.put("java.lang.ArithmeticException", "系统在进行数学运算时发生错误");
        EXCEPTION_MESSAGE_MAP.put("java.lang.RuntimeException", "系统在运行时发生错误");
        EXCEPTION_MESSAGE_MAP.put("com.example.wwg.exception.LoginException", "登录过程中运行错误");
    }
    public static final String MESSAGE_SAVE_SUCCESS = "保存成功";
    public static final String MESSAGE_SAVE_FAILED = "保存失败";
}
