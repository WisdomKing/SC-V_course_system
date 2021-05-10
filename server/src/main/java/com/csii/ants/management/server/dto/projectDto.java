package com.csii.ants.management.server.dto;


public class projectDto {

    /**
    * 项目id
    */
    private String proid;
    /**
    * 项目名称
    */
    private String proname;
    /**
    * 部门id
    */
    private String depid;

    public String getProid() {
    return proid;
    }

    public void setProid(String proid) {
    this.proid = proid;
    }

    public String getProname() {
    return proname;
    }

    public void setProname(String proname) {
    this.proname = proname;
    }

    public String getDepid() {
    return depid;
    }

    public void setDepid(String depid) {
    this.depid = depid;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("projectDto{");
        sb.append("proid='").append(proid).append('\'');
        sb.append(", proname='").append(proname).append('\'');
        sb.append(", depid='").append(depid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}