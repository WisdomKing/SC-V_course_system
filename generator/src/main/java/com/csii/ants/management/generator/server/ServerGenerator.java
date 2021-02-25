package com.csii.ants.management.generator.server;

import com.csii.ants.management.generator.util.FreeMarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:
 */
public class ServerGenerator {
    /**
     * 服务端的Controller、Service、Dto全部用这个启动类生成
     */
    static String toServicePath = "server\\src\\main\\java\\com\\csii\\ants\\management\\server\\service\\";

    public static void main(String[] args) throws IOException, TemplateException {
        String Domain="Headline";
        String domain="headline";
        Map<String,Object> map=new HashMap<>();
        map.put("Domain",Domain);
        map.put("domain",domain);

        FreeMarkerUtil.initConfig("service.ftl");
        FreeMarkerUtil.generator(toServicePath+Domain+"Service.java",map);
    }
}
