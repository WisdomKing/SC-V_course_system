package com.csii.ants.management.server.mapper;

import com.csii.ants.management.server.dto.ResourceDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyUserMapper {

    List<ResourceDto> findResources(@Param("jobNum") String jobNum);

}
