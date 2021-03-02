package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/2
 * @Description:
 */
public enum LeaveStatusEnum {

    Approved("A","已审批"),
    Rejected("R","已拒绝"),
    Commit("C","已提交"),
    Saved("S","已保存"),
    Process("P","流程中");

    private String code;

    private String desc;

    LeaveStatusEnum(String code, String desc) {
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
