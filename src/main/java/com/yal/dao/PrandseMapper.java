package com.yal.dao;

import com.yal.pojo.Prandse;
import com.yal.pojo.PrandseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface PrandseMapper {
    int countByExample(PrandseExample example);

    int deleteByExample(PrandseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Prandse record);

    int insertSelective(Prandse record);

    List<Prandse> selectByExample(PrandseExample example);

    Prandse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Prandse record, @Param("example") PrandseExample example);

    int updateByExample(@Param("record") Prandse record, @Param("example") PrandseExample example);

    int updateByPrimaryKeySelective(Prandse record);

    int updateByPrimaryKey(Prandse record);
}