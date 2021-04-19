package com.csii.ants.management.server.dto;


public class userDto {

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
    * 密码
    */
    private String password;
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

    public String getPassword() {
    return password;
    }

    public void setPassword(String password) {
    this.password = password;
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
    sb.append(", companyemail=").append(companyemail);
    sb.append(", name=").append(name);
    sb.append(", password=").append(password);
    sb.append(", role=").append(role);
sb.append("]");
return sb.toString();
}

}