package com.csii.ants.management.server.dto;


import java.util.List;

public class RoleDto {

    /**
    * id
    */
    private String id;
    /**
    * 角色
    */
    private String name;
    /**
    * 描述
    */
    private String desc;
    /**
     * 接收前端传来的资源id的list
     */
    private List<String> resourceIds;
    /**
     * 接收前端传来的用户id的list
     */
    private List<String> jobNums;

    public List<String> getJobNums() {
        return jobNums;
    }

    public void setJobNums(List<String> jobNums) {
        this.jobNums = jobNums;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getDesc() {
    return desc;
    }

    public void setDesc(String desc) {
    this.desc = desc;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RoleDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", resourceIds=").append(resourceIds);
        sb.append(", jobNums=").append(jobNums);
        sb.append('}');
        return sb.toString();
    }
}