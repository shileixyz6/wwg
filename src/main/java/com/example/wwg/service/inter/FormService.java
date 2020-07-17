package com.example.wwg.service.inter;

import com.example.wwg.common.ResultData;
import com.example.wwg.model.Form;

import javax.xml.ws.Response;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-16 17:18
 */
public interface FormService {
    /**
     * 添加诉求
     * @param form
     * @return
     */
    ResultData addAppeal(Form form);
    /**
     * 按照诉求id查询诉求
     * @param formId
     * @return
     */
    ResultData selectAppeal(Long formId);
}
