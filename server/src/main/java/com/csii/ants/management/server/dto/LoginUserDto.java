package com.csii.ants.management.server.dto;


import java.util.HashSet;
import java.util.List;

public class LoginUserDto {
    /**
     * id
     */
    private String jobNum;
    /**
     * 登陆名
     */
    private String loginName;
    /**
     * 昵称
     */
    private String name;
    /**
     * 登录凭证
     */
    private String token;
    /**
     * 所有资源，用于前端界面控制
     */
    private List<ResourceDto> resources;
    /**
     * 所有资源中的请求，用于后端接口拦截
     */
    private HashSet<String> requests;

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<ResourceDto> getResources() {
        return resources;
    }

    public void setResources(List<ResourceDto> resources) {
        this.resources = resources;
    }

    public HashSet<String> getRequests() {
        return requests;
    }

    public void setRequests(HashSet<String> requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LoginUserDto{");
        sb.append("jobNum='").append(jobNum).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append(", resources=").append(resources);
        sb.append(", requests=").append(requests);
        sb.append('}');
        return sb.toString();
    }
}