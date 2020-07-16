package com.example.wwg.service.impl;

import com.example.wwg.common.ResultData;
import com.example.wwg.dao.FormMapper;
import com.example.wwg.model.Form;
import com.example.wwg.service.inter.FormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.example.wwg.common.ResponseCode.ERROR;
import static com.example.wwg.common.ResponseCode.SUCCESS;
import static com.example.wwg.common.constant.MESSAGE_SAVE_FAILED;
import static com.example.wwg.common.constant.MESSAGE_SAVE_SUCCESS;

/**
 * @Author: sl
 * @Description:
 * @Date: 2020-07-16 17:23
 */
@Service
public class FormServiceImpl implements FormService {
    @Resource
    FormMapper formMapper;

    /**
     * 添加诉求
     * @param form
     * @return
     */
    @Override
    public ResultData addAppeal(Form form) {
        ResultData resultData = new ResultData();
        int count = formMapper.insert(form);
        if(count == 0){
            resultData.setMsg(MESSAGE_SAVE_FAILED);
            resultData.setCode(ERROR.getVal());
            return resultData;
        }
        resultData.setMsg(MESSAGE_SAVE_SUCCESS);
        resultData.setCode(SUCCESS.getVal());
        return resultData;
    }
}
