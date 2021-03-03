package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum PoliticalOutlookEnum {

    Masses("Q","群众"),
    League("T","团员"),
    Probationary("Y","预备党员"),
    Party("D","党员");

    private String code;

    private String desc;

    PoliticalOutlookEnum(String code, String desc) {
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
