package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/2
 * @Description:
 */
public enum ClockinStatusEnum {
    //Approved是开发人员用的,A是查询用的,"已审批"是给用户用的
    Approved("A","已审批"),
    Rejected("R","已拒绝"),
    Commit("C","已提交");

    private String code;

    private String desc;

    ClockinStatusEnum(String code, String desc) {
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
