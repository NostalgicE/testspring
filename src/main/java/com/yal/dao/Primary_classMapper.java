package com.yal.dao;

import com.yal.pojo.Primary_class;
import com.yal.pojo.Primary_classExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface Primary_classMapper {
    int countByExample(Primary_classExample example);

    int deleteByExample(Primary_classExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Primary_class record);

    int insertSelective(Primary_class record);

    List<Primary_class> selectByExample(Primary_classExample example);

    Primary_class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Primary_class record, @Param("example") Primary_classExample example);

    int updateByExample(@Param("record") Primary_class record, @Param("example") Primary_classExample example);

    int updateByPrimaryKeySelective(Primary_class record);

    int updateByPrimaryKey(Primary_class record);
}