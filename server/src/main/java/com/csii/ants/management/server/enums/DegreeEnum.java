package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/3
 * @Description:
 */
public enum DegreeEnum {
    Primary("P","小学学历"),
    Junior("J","初中学历"),
    Highschool("H","高中学历"),
    College("C","专科学历"),
    Bachelor("B","本科学历"),
    Master("M","硕士学历"),
    Doctoral("D","博士学历"),
    Noeducation("N","无学历");

    private String code;

    private String desc;

    DegreeEnum(String code, String desc) {
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
