package com.example.wwg.dao;

import com.example.wwg.model.Form;
import com.example.wwg.model.FormExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FormMapper {
    long countByExample(FormExample example);

    int deleteByExample(FormExample example);

    int deleteByPrimaryKey(Long formId);

    int insert(Form record);

    int insertSelective(Form record);

    List<Form> selectByExample(FormExample example);

    Form selectByPrimaryKey(Long formId);

    int updateByExampleSelective(@Param("record") Form record, @Param("example") FormExample example);

    int updateByExample(@Param("record") Form record, @Param("example") FormExample example);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}