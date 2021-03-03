package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.domain.Personalinfo;
import com.csii.ants.management.server.domain.PersonalinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalinfoMapper {
    long countByExample(PersonalinfoExample example);

    int deleteByExample(PersonalinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Personalinfo record);

    int insertSelective(Personalinfo record);

    List<Personalinfo> selectByExample(PersonalinfoExample example);

    Personalinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Personalinfo record, @Param("example") PersonalinfoExample example);

    int updateByExample(@Param("record") Personalinfo record, @Param("example") PersonalinfoExample example);

    int updateByPrimaryKeySelective(Personalinfo record);

    int updateByPrimaryKey(Personalinfo record);
}