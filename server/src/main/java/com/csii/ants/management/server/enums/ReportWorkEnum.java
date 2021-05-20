package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/5/19
 * @Description:
 */
public enum ReportWorkEnum {

    clockIn("01","报工"),
    leave("02","请假");

    private String code;

    private String desc;

    ReportWorkEnum(String code, String desc) {
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