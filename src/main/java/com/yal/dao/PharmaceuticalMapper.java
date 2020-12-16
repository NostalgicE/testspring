package com.yal.dao;

import com.yal.pojo.Pharmaceutical;
import com.yal.pojo.PharmaceuticalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface PharmaceuticalMapper {
    int countByExample(PharmaceuticalExample example);

    int deleteByExample(PharmaceuticalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pharmaceutical record);

    int insertSelective(Pharmaceutical record);

    List<Pharmaceutical> selectByExample(PharmaceuticalExample example);

    Pharmaceutical selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pharmaceutical record, @Param("example") PharmaceuticalExample example);

    int updateByExample(@Param("record") Pharmaceutical record, @Param("example") PharmaceuticalExample example);

    int updateByPrimaryKeySelective(Pharmaceutical record);

    int updateByPrimaryKey(Pharmaceutical record);
}