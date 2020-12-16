package com.yal.dao;

import com.yal.pojo.Seandre;
import com.yal.pojo.SeandreExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface SeandreMapper {
    int countByExample(SeandreExample example);

    int deleteByExample(SeandreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Seandre record);

    int insertSelective(Seandre record);

    List<Seandre> selectByExample(SeandreExample example);

    Seandre selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Seandre record, @Param("example") SeandreExample example);

    int updateByExample(@Param("record") Seandre record, @Param("example") SeandreExample example);

    int updateByPrimaryKeySelective(Seandre record);

    int updateByPrimaryKey(Seandre record);
}