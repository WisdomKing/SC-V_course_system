package com.csii.ants.management.server.dto;


public class departmentDto {

    /**
    * 部门id
    */
    private String depid;
    /**
    * 部门名称
    */
    private String depname;
    /**
    * 部门总监
    */
    private String depdirector;

    public String getDepid() {
    return depid;
    }

    public void setDepid(String depid) {
    this.depid = depid;
    }

    public String getDepname() {
    return depname;
    }

    public void setDepname(String depname) {
    this.depname = depname;
    }

    public String getDepdirector() {
    return depdirector;
    }

    public void setDepdirector(String depdirector) {
    this.depdirector = depdirector;
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(getClass().getSimpleName());
sb.append(" [");
sb.append("Hash = ").append(hashCode());
    sb.append(", depid=").append(depid);
    sb.append(", depname=").append(depname);
    sb.append(", depdirector=").append(depdirector);
sb.append("]");
return sb.toString();
}

}