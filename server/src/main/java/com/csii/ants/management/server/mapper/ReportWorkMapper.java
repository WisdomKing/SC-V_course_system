package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.ReportWork;
import com.csii.ants.management.server.domain.ReportWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportWorkMapper {
    long countByExample(ReportWorkExample example);

    int deleteByExample(ReportWorkExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReportWork record);

    int insertSelective(ReportWork record);

    List<ReportWork> selectByExample(ReportWorkExample example);

    ReportWork selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReportWork record, @Param("example") ReportWorkExample example);

    int updateByExample(@Param("record") ReportWork record, @Param("example") ReportWorkExample example);

    int updateByPrimaryKeySelective(ReportWork record);

    int updateByPrimaryKey(ReportWork record);
}