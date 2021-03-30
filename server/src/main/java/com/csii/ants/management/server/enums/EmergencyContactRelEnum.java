package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum EmergencyContactRelEnum {
    Parent("P","父母"),
    Spouse("S","伴侣"),
    Children("C","子女"),
    Otherrelatives("O","其他亲戚"),
    Friend("F","朋友");

    private String code;

    private String desc;

    EmergencyContactRelEnum(String code, String desc) {
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
