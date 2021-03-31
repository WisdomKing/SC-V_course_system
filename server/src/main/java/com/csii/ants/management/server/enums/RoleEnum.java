package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/30
 * @Description:
 */
public enum RoleEnum {

    ALL("ALL","普通用户"),
    PM("PM","项目经理"),
    PD("PD","项目总监"),
    HRD("HRD","人事总监");

    private String code;

    private String desc;

    RoleEnum(String code, String desc) {
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
