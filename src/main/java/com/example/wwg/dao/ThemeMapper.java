package com.example.wwg.dao.mapper;

import com.example.wwg.model.Theme;
import com.example.wwg.model.ThemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeMapper {
    long countByExample(ThemeExample example);

    int deleteByExample(ThemeExample example);

    int deleteByPrimaryKey(Long themeId);

    int insert(Theme record);

    int insertSelective(Theme record);

    List<Theme> selectByExample(ThemeExample example);

    Theme selectByPrimaryKey(Long themeId);

    int updateByExampleSelective(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByExample(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);
}