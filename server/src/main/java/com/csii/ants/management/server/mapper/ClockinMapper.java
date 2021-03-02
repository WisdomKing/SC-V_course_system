package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.Clockin;
import com.csii.ants.management.server.domain.ClockinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClockinMapper {
    long countByExample(ClockinExample example);

    int deleteByExample(ClockinExample example);

    int deleteByPrimaryKey(String id);

    int insert(Clockin record);

    int insertSelective(Clockin record);

    List<Clockin> selectByExample(ClockinExample example);

    Clockin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Clockin record, @Param("example") ClockinExample example);

    int updateByExample(@Param("record") Clockin record, @Param("example") ClockinExample example);

    int updateByPrimaryKeySelective(Clockin record);

    int updateByPrimaryKey(Clockin record);
}