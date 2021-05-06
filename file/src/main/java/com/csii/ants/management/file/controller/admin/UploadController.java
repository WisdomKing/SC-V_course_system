package com.csii.ants.management.file.controller.admin;

import com.csii.ants.management.server.dto.ResponseDto;
import com.csii.ants.management.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@RestController
public class UploadController {

    private static final Logger LOG = LoggerFactory.getLogger(com.csii.ants.management.file.controller.admin.UploadController.class);

    public static final String BUSINESS_NAME = "文件上传";

    @Value("${file.domain}")
    private String FILE_DOMAIN;

    @Value("${file.path}")
    private String FILE_PATH;

    @RequestMapping("/upload")
    //接收表单的file变量，file是一个富文本文件
    public ResponseDto upload(@RequestParam MultipartFile file) throws IOException {
        //打印整个文件、文件名、文件大小的日志
        LOG.info("上传文件开始:{}",file);
        LOG.info(file.getOriginalFilename());
        LOG.info(String.valueOf(file.getSize()));

        //
        String fileName=file.getOriginalFilename();
        String key= UuidUtil.getShortUuid();
        String fullPath=FILE_PATH+"/headline/" + key + "-" + fileName;
        //目标位置
        File dest=new File(fullPath);
        //写入目标位置
        file.transferTo(dest);
        //打印目标位置全路径
        LOG.info(dest.getAbsolutePath());

        ResponseDto responseDto = new ResponseDto();

        responseDto.setContent(FILE_DOMAIN+"f/headline/"+ key + "-" + fileName);

        return responseDto;
    }

}
