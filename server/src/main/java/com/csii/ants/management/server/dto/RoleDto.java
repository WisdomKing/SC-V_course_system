package com.csii.ants.management.server.dto;


public class RoleDto {

    /**
    * 工号
    */
    private String jobNum;
    /**
    * 权限
    */
    private String role;

    public String getJobNum() {
    return jobNum;
    }

    public void setJobNum(String jobNum) {
    this.jobNum = jobNum;
    }

    public String getRole() {
    return role;
    }

    public void setRole(String role) {
    this.role = role;
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(getClass().getSimpleName());
sb.append(" [");
sb.append("Hash = ").append(hashCode());
    sb.append(", jobNum=").append(jobNum);
    sb.append(", role=").append(role);
sb.append("]");
return sb.toString();
}

}