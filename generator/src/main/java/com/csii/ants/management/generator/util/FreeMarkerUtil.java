package com.csii.ants.management.generator.util;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * @author ZxM
 * @date 2021/2/25
 * @Description:
 */
public class FreeMarkerUtil {
    /**
     * 因为ServerGenerator的main方法要调用类里的方法，所以要用static修饰
     */
    static String ftlPath = "generator\\src\\main\\java\\com\\csii\\ants\\management\\generator\\ftl\\";
    static Template temp;

    public static void initConfig(String ftlName) throws IOException {
        //读模板
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
        //读模板的路径
        cfg.setDirectoryForTemplateLoading(new File(ftlPath));
        cfg.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_30));
        //读具体路径下的哪一个模板
        temp = cfg.getTemplate(ftlName);
    }
    public static void generator(String fileName, Map<String,Object> map) throws IOException, TemplateException {
        //根据模板生成文件
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        temp.process(map, bw);
        bw.flush();
        fw.close();
    }
}
