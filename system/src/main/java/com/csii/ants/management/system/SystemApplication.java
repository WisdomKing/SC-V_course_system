package com.csii.ants.management.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author 曾晓明
 * @date 2021/2/1
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.csii.ants.management.system.mapper")
public class SystemApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SystemApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("System 地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
