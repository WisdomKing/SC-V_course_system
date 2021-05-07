package com.csii.ants.management.generator.server;

import com.csii.ants.management.generator.util.DbUtil;
import com.csii.ants.management.generator.util.Field;
import com.csii.ants.management.generator.util.FreeMarkerUtil;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
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
//    static String MODULE = "business";
    static String MODULE = "system";
//    static String MODULE = "file";
    static String toDtoPath = "server\\src\\main\\java\\com\\csii\\ants\\management\\server\\dto\\";
    static String toServicePath = "server\\src\\main\\java\\com\\csii\\ants\\management\\server\\service\\";
    static String toControllerPath =MODULE+ "\\src\\main\\java\\com\\csii\\ants\\management\\"+MODULE+"\\controller\\admin\\";
    static String generatorConfigPath = "server\\src\\main\\resources\\generator\\generatorConfig.xml";

    public static void main(String[] args) throws Exception {

        String module=MODULE;

        // 只生成配置文件中的第一个table节点
        File file = new File(generatorConfigPath);
        SAXReader reader=new SAXReader();
        //读取xml文件到Document中
        Document doc=reader.read(file);
        //获取xml文件的根节点
        Element rootElement=doc.getRootElement();
        //读取context节点
        Element contextElement = rootElement.element("context");
        //定义一个Element用于遍历
        Element tableElement;
        //取第一个“table”的节点
        tableElement=contextElement.elementIterator("table").next();
        //table的属性
        String Domain = tableElement.attributeValue("domainObjectName");
        String tableName = tableElement.attributeValue("tableName");
        String tableNameCn = DbUtil.getTableComment(tableName);
        String domain = Domain.substring(0, 1).toLowerCase() + Domain.substring(1);
        System.out.println("表："+tableElement.attributeValue("tableName"));
        System.out.println("Domain："+tableElement.attributeValue("domainObjectName"));

        List<Field> fieldList=DbUtil.getColumnByTableName(tableName);
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
