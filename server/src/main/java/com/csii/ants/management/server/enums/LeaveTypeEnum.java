package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/2
 * @Description:
 */
public enum LeaveTypeEnum {

    Annual("N","年假"),
    Personal("S","事假"),
    Sick("B","病假"),
    Marriage("H","婚假"),
    Maternity("C","产假"),
    Paternity("P","陪产假"),
    Condole("W","慰唁假"),
    Antenatal("J","产检假");

    private String code;

    private String desc;

    LeaveTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
