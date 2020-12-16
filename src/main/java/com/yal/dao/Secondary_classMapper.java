package com.yal.dao;

import com.yal.pojo.Secondary_class;
import com.yal.pojo.Secondary_classExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Secondary_classMapper {
    int countByExample(Secondary_classExample example);

    int deleteByExample(Secondary_classExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Secondary_class record);

    int insertSelective(Secondary_class record);

    List<Secondary_class> selectByExample(Secondary_classExample example);

    Secondary_class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Secondary_class record, @Param("example") Secondary_classExample example);

    int updateByExample(@Param("record") Secondary_class record, @Param("example") Secondary_classExample example);

    int updateByPrimaryKeySelective(Secondary_class record);

    int updateByPrimaryKey(Secondary_class record);
}