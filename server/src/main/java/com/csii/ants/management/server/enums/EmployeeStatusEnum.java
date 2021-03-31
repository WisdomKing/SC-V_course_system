package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/30
 * @Description:
 */
public enum EmployeeStatusEnum {

    internship("INT","实习期"),
    probation("PRO","试用期"),
    contract("CON","合同工"),
    departure("DEP","离职期");

    private String code;

    private String desc;

    EmployeeStatusEnum(String code, String desc) {
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
