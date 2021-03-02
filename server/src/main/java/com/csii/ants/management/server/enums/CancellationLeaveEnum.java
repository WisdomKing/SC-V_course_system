package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/2
 * @Description:
 */
public enum CancellationLeaveEnum {

    Yes("Y", "是"),
    No("N", "否");

    private String code;

    private String desc;

    CancellationLeaveEnum(String code, String desc) {
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
