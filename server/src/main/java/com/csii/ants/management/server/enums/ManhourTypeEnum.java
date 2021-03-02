package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/2
 * @Description:
 */
public enum ManhourTypeEnum {
    Delivery("D","交付项目"),
    Presale("P","售前项目"),
    Research("R","研发项目"),
    Inside("I","内部项目");

    private String code;

    private String desc;

    ManhourTypeEnum(String code, String desc) {
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
