package com.example.wwg.common;
/**
 * @Author : xiao
 * @Date : 2020/7/16 17:52
 */

/**
 * @program: wwg
 * @description: 自定義異常
 * @author: Mr.Xiao
 * @create: 2020-07-16 17:52
 **/
public class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;

    public MyException() {}

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
