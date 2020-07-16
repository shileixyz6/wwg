package com.example.wwg.common;/**
 * @Author : xiao
 * @Date : 2020/7/16 10:13
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @program: wwg
 * @description: 统一返回结果集
 * @author: Mr.Xiao
 * @create: 2020-07-16 10:13
 **/
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL) //如果有属性为null则该属性不返回给前端时
public class ResultData {
    private String code;

    private String msg;

    private Object data;

    public static ResultData success(Object data) {
        return resultData(ResponseCode.SUCCESS.val(), ResponseCode.SUCCESS.msg(), data);
    }

    public static ResultData success(Object data, String msg) {
        return resultData(ResponseCode.SUCCESS.val(), msg, data);
    }

    public static ResultData fail(String code, String msg) {
        return resultData(code, msg, null);
    }

    public static ResultData fail(String code, String msg, Object data) {
        return resultData(code, msg, data);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private static ResultData resultData(String code, String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(code);
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }
}
