package com.example.wwg.controller;

import com.example.wwg.common.ResultData;
import com.example.wwg.model.Form;
import com.example.wwg.service.inter.FormService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: sl
 * @Description:诉求接口
 * @Date: 2020-07-16 17:37
 */
@RestController
@RequestMapping("/appeal")
public class FormController {
    @Resource
    FormService formService;

    /**
     * 添加诉求
     * @param form
     * @return
     */
    @PostMapping("/addAppeal")
    public ResultData addAppeal(@RequestBody Form form){
        return formService.addAppeal(form);
    }

    /**
     * 根据诉求id查询诉求
     * @param formId
     * @return
     */
    @PostMapping("/selectAppeal")
    public ResultData selectAppeal(@RequestParam Long formId){
        return formService.selectAppeal(formId);
    }
}
