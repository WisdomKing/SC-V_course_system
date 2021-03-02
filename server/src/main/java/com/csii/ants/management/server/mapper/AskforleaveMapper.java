package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.Askforleave;
import com.csii.ants.management.server.domain.AskforleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskforleaveMapper {
    long countByExample(AskforleaveExample example);

    int deleteByExample(AskforleaveExample example);

    int deleteByPrimaryKey(String id);

    int insert(Askforleave record);

    int insertSelective(Askforleave record);

    List<Askforleave> selectByExample(AskforleaveExample example);

    Askforleave selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Askforleave record, @Param("example") AskforleaveExample example);

    int updateByExample(@Param("record") Askforleave record, @Param("example") AskforleaveExample example);

    int updateByPrimaryKeySelective(Askforleave record);

    int updateByPrimaryKey(Askforleave record);
}