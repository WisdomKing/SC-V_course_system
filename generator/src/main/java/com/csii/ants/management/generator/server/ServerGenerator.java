package com.csii.ants.management.generator.server;

import com.csii.ants.management.generator.util.FreeMarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:
 */
public class ServerGenerator {
    /**
     * 服务端的Controller、Service、Dto全部用这个启动类生成
     */
    static String toPath = "generator\\src\\main\\java\\com\\csii\\ants\\management\\generator\\test\\";

    public static void main(String[] args) throws IOException, TemplateException {
        FreeMarkerUtil.initConfig("test.ftl");
        FreeMarkerUtil.generator(toPath+"Test.java");
    }
}
