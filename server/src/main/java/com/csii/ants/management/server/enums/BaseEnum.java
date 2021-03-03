package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum BaseEnum {

    Beijing("BJ","北京"),
    Shanghai("SH","上海"),
    Guangzhou("GZ","广州"),
    Shenzhen("SZ","深圳"),
    Hangzhou("HZ","杭州"),
    Chengdu("CD","成都"),
    Wuhan("WH","武汉"),
    Xian("XA","西安"),
    Nanjing("NJ","南京"),
    Changsha("CS","长沙"),
    Nanchang("NC","南昌"),
    Xiamen("XM","厦门"),
    Dalian("DL","大连");

    private String code;

    private String desc;

    BaseEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
