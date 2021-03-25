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
//
//    /**
//     * 保存-时间格式校验 2021-02-28 00:00:00或者20210228 000000
//     */
//    public static void istime(String args) {
//        String str = "";
//        String pattern = "^((\\d{2}(([02468][048])|([13579][26]))[\\-]?((((0[13578])|(1[02]))[\\-]?((0[1-9])|([1-2][0-9])|(3[01])))|(((0[469])|(11))[\\-]?((0[1-9])|([1-2][0-9])|(30)))|(02[\\-]?((0[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-]?((((0[13578])|(1[02]))[\\-]?((0[1-9])|([1-2][0-9])|(3[01])))|(((0[469])|(11))[\\-]?((0[1-9])|([1-2][0-9])|(30)))|(02[\\-]?((0[1-9])|(1[0-9])|(2[0-8])))))) (((([0-1][0-9])|(2[0-3]))[\\:]?([0-5][0-9])[\\:]?((([0-5][0-9])))))$";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(str);
//        m.matches();
//    }
//
//    /**
//     * 标准时间格式 2021-02-28 00:00:00
//     * @param datetime
//     */
//    public static String standardDatetime(String datetime) {
//        if (datetime.charAt(4) != '-') {
//            datetime = datetime.substring(0, 4) + "-" + datetime.substring(4, datetime.length());
//        }
//        if (datetime.charAt(7) != '-') {
//            datetime = datetime.substring(0, 7) + "-" + datetime.substring(7, datetime.length());
//        }
//        if (datetime.charAt(13) != ':') {
//            datetime = datetime.substring(0, 13) + ":" + datetime.substring(13, datetime.length());
//        }
//        if (datetime.charAt(16) != ':') {
//            datetime = datetime.substring(0, 16) + ":" + datetime.substring(16, datetime.length());
//        }
//        return datetime;
//    }

}
