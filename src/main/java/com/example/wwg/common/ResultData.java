package com.example.wwg.common;/**
 * @Author : xiao
 * @Date : 2020/7/16 10:13
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.google.gson.Gson;


import java.util.HashMap;
import java.util.Map;


/**
 * @program: wwg
 * @description: 统一返回结果集
 * @author: Mr.Xiao
 * @create: 2020-07-16 10:13
 **/
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL) //如果有属性为null则该属性不返回给前端时
public class ResultData <T> {
    private String code;

    private String msg;

    private T data;

    public static Gson gson = new Gson();

    public ResultData(){

    }

    public ResultData(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static String successWithoutData() {
        return success(null);
    }
    public static<T> String success(T data) {
        return gson.toJson(new ResultData("0", "解析成功", data));
    }

    public static String failed() {
        return failed("解析失败");
    }
    public static String failed(String msg) {
        return failed("-1", msg,null);
    }
    public static <T> String failed(String code, String msg,T data) {
        return gson.toJson(new ResultData(code, msg, data));
    }

}
