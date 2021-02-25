package com.csii.ants.management.generator.server;

import com.csii.ants.management.generator.util.DbUtil;
import com.csii.ants.management.generator.util.Field;
import com.csii.ants.management.generator.util.FreeMarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.*;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:
 */
public class ServerGenerator {
    /**
     * 服务端的Controller、Service、Dto全部用这个启动类生成
     * 支持重复生成
     */
    static String MODULE = "business";
    static String toDtoPath = "server\\src\\main\\java\\com\\csii\\ants\\management\\server\\dto\\";
    static String toServicePath = "server\\src\\main\\java\\com\\csii\\ants\\management\\server\\service\\";
    static String toControllerPath =MODULE+ "\\src\\main\\java\\com\\csii\\ants\\management\\"+MODULE+"\\controller\\admin\\";

    public static void main(String[] args) throws Exception {
        String Domain="Headline";
        String domain="headline";
        String tableNameCn="头条";
        String module=MODULE;
        List<Field> fieldList=DbUtil.getColumnByTableName(domain);
        Set<String> typeSet=getJavaTypes(fieldList);

        Map<String,Object> map=new HashMap<>();
        map.put("Domain",Domain);
        map.put("domain",domain);
        map.put("tableNameCn",tableNameCn);
        map.put("module",module);
        map.put("fieldList",fieldList);
        map.put("typeSet",typeSet);

        //生成Dto
        FreeMarkerUtil.initConfig("dto.ftl");
        FreeMarkerUtil.generator(toDtoPath+Domain+"Dto.java",map);

        //生成service
        FreeMarkerUtil.initConfig("service.ftl");
        FreeMarkerUtil.generator(toServicePath+Domain+"Service.java",map);

        //生成controller
        FreeMarkerUtil.initConfig("controller.ftl");
        FreeMarkerUtil.generator(toControllerPath+Domain+"Controller.java",map);
    }

    /**
     * 获取所有的Java类型，使用Set去重
     */
    private static Set<String> getJavaTypes(List<Field> fieldList) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < fieldList.size(); i++) {
            Field field = fieldList.get(i);
            set.add(field.getJavaType());
        }
        return set;
    }
}
