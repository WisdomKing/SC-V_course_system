package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum MaritalStatusEnum {
    Yes("Y","是"),
    No("N","否");

    private String code;

    private String desc;

    MaritalStatusEnum(String code, String desc) {
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
