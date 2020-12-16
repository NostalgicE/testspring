package com.yal.dao;

import com.yal.pojo.Reclassify_class;
import com.yal.pojo.Reclassify_classExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface Reclassify_classMapper {
    int countByExample(Reclassify_classExample example);

    int deleteByExample(Reclassify_classExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reclassify_class record);

    int insertSelective(Reclassify_class record);

    List<Reclassify_class> selectByExample(Reclassify_classExample example);

    Reclassify_class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reclassify_class record, @Param("example") Reclassify_classExample example);

    int updateByExample(@Param("record") Reclassify_class record, @Param("example") Reclassify_classExample example);

    int updateByPrimaryKeySelective(Reclassify_class record);

    int updateByPrimaryKey(Reclassify_class record);
}