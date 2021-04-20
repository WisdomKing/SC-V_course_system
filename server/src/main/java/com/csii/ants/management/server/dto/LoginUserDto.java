package com.csii.ants.management.server.dto;


public class LoginUserDto {

    /**
     * 工号
     */
    private String jobNum;
    /**
     * 登陆名
     */
    private String companyemail;
    /**
     * 昵称
     */
    private String name;
    /**
     * 权限
     */
    private String role;
    /**
     * 登录标识
     */
    private String token;

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getCompanyemail() {
        return companyemail;
    }

    public void setCompanyemail(String companyemail) {
        this.companyemail = companyemail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobNum=").append(jobNum);
        sb.append(", companyemail=").append(companyemail);
        sb.append(", name=").append(name);
        sb.append(", role=").append(role);
        sb.append(", token=").append(token);
        sb.append("]");
        return sb.toString();
    }

}