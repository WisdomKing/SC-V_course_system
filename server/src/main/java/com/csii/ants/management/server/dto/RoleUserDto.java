package com.csii.ants.management.server.dto;


public class RoleUserDto {

    /**
    * id
    */
    private String id;
    /**
    * 角色|id
    */
    private String roleId;
    /**
    * 用户|id
    */
    private String jobNum;

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public String getRoleId() {
    return roleId;
    }

    public void setRoleId(String roleId) {
    this.roleId = roleId;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RoleUserDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", roleId='").append(roleId).append('\'');
        sb.append(", jobNum='").append(jobNum).append('\'');
        sb.append('}');
        return sb.toString();
    }
}