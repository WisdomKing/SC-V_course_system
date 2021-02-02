package com.csii.ants.management.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾晓明
 * @date 2021/2/2
 * @Description:
 */

/**
 * 如果返回的是json数据用 @RestController,如果返回的是页面用 @Controller;
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "success!!!";
    }
}
