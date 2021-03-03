package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum ProvinceEnum {
    Anhui("AH","安徽"),
    Beijing("BJ","北京"),
    Fujian("FJ","福建"),
    Gansu("GS","甘肃"),
    Guangdong("GD","广东"),

    Guangxi("GX","广西"),
    Guizhou("GZ","贵州"),
    Hainan("HI","海南"),
    Hebei("HE","河北"),
    Henan("HA","河南"),

    Heilongjiang("HL","黑龙江"),
    Hubei("HB","湖北"),
    Hunan("HN","湖南"),
    Jilin("JL","吉林"),
    Jiangsu("JS","江苏"),

    Jiangxi("JX","江西"),
    Liaoning("LN","辽宁"),
    InnerMongoria("IM","内蒙古"),
    Ningxia("NX","宁夏"),
    Qinghai("QH","青海"),

    Shandong("SD","山东"),
    Shanxi("SX","山西"),
    Shaanxi("SN","陕西"),
    Shanghai("SH","上海"),
    Sichuan("SC","四川"),

    Tianjing("TJ","天津"),
    Tibet("XZ","西藏"),
    Xinjiang("XJ","新疆"),
    Yunnan("YN","云南"),
    Zhejiang("ZJ","浙江"),

    Chongqing("CQ","重庆"),
    Macao("MO","澳门"),
    HongKong("HK","香港"),
    Taiwan("TW","台湾");

    private String code;

    private String desc;

    ProvinceEnum(String code, String desc) {
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
