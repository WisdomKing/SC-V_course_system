package com.csii.ants.management.server.service;

import com.csii.ants.management.server.domain.Test;
import com.csii.ants.management.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZxM
 * @date 2021/2/3
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
