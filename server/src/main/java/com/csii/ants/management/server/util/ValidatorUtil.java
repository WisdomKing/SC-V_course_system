package com.csii.ants.management.server.util;

import com.csii.ants.management.server.exception.ValidatorException;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ZxM
 * @date 2021/2/24
 * @Description:
 */
public class ValidatorUtil {

    /**
     * 空校验（null or ""）
     * 使用Object而不是String的原因是还有其他的类型也需要进行整改校验
     */
    public static void require(Object str, String fieldName) {
        if (StringUtils.isEmpty(str)) {
            throw new ValidatorException(fieldName + "不能为空");
        }
    }

    /**
     * 长度校验
     */
    public static void length(String str, String fieldName, int min, int max) {
        //如果这个值为空，就不校验判断的
        if (StringUtils.isEmpty(str)) {
            return;
        }
        int length = 0;
        if (!StringUtils.isEmpty(str)) {
            length = str.length();
        }
        if (length < min || length > max) {
            throw new ValidatorException(fieldName + "长度" + min + "~" + max + "位");
        }
    }
    /**
     * 邮箱校验
     */

}
