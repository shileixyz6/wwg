package com.example.wwg.controller;
/**
 * @Author : xiao
 * @Date : 2020/7/16 17:58
 */

import com.example.wwg.common.MyException;
import com.example.wwg.common.ResultData;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * @program: wwg
 * @description: 日誌測試
 * @author: Mr.Xiao
 * @create: 2020-07-16 17:58
 **/
@Slf4j
@Controller
public class LogTestController {

    @RequestMapping("/logtest")
    public ResultData Test(@RequestParam(value = "role") Integer role) throws Exception {

        int i = role;log.info("訪問了controller");

        //Exception异常会自动拦截，这里只是做个测试自定义异常
        if (i<0) {
            //int j = i / 0;
            throw new MyException("999", "异常");
        } else {
            return new ResultData(200, "成功", new HashMap<>(0));
        }
    }

}
