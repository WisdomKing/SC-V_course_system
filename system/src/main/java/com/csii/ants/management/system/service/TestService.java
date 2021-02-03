package com.csii.ants.management.system.service;

import com.csii.ants.management.system.domain.Test;
import com.csii.ants.management.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 曾晓明
 * @date 2021/2/2
 * @Description:
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
