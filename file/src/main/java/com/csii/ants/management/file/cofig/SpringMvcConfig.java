package com.csii.ants.management.file.cofig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Value("${file.path}")
    private String FILE_PATH;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //增加一个请求标识符，所有带/f的都认为是静态资源
        registry.addResourceHandler("/f/**").addResourceLocations("file:" + FILE_PATH);
//        registry.addResourceHandler("/f/**").addResourceLocations("file:F:/file/imooc/course/");
        //全路径 http://127.0.0.1:9003/file/f/xxxx.jpg
    }
}