package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.Headline;
import com.csii.ants.management.server.domain.HeadlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeadlineMapper {
    long countByExample(HeadlineExample example);

    int deleteByExample(HeadlineExample example);

    int deleteByPrimaryKey(String id);

    int insert(Headline record);

    int insertSelective(Headline record);

    List<Headline> selectByExample(HeadlineExample example);

    Headline selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Headline record, @Param("example") HeadlineExample example);

    int updateByExample(@Param("record") Headline record, @Param("example") HeadlineExample example);

    int updateByPrimaryKeySelective(Headline record);

    int updateByPrimaryKey(Headline record);
}