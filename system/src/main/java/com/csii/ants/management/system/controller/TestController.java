package com.csii.ants.management.system.controller;

import com.csii.ants.management.server.domain.Test;
import com.csii.ants.management.server.service.TestService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZxM
 * @date 2021/2/2
 * @Description:测试
 */

/**
 * 如果返回的是json数据用 @RestController,如果返回的是页面用 @Controller;
 */

/**
 * 路由跳转的三种方法
 * 第一种方法，在方法前面加 @RequestMapping("/system/test")，但是过于繁琐
 * 第二种方法，在类前面加@RequestMapping("/system")，类多了也繁琐
 * 第三种方法，在application.properties里加server.servlet.context-path=/system
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test() {
        return testService.list();
    }
/*
    //查询用户(从eclipse物流项目copy过来的模块)
    @ResponseBody
    @RequestMapping("query")
    public String query(WarehouseInfo record) {
        DataGridResult rs = warehouseService.query(record);
        return JSON.toJSONString(rs);
    }
 */
}
