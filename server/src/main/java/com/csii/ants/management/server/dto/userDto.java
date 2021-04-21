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
     * 验证码
     */
    private String imageCode;
    /**
     * 图片验证码token
     */
    private String imageCodeToken;

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

    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public String getImageCodeToken() {
        return imageCodeToken;
    }

    public void setImageCodeToken(String imageCodeToken) {
        this.imageCodeToken = imageCodeToken;
    }

    @Override
public String toString() {
    final StringBuffer sb = new StringBuffer("userDto{");
    sb.append(", jobNum=").append(jobNum).append('\'');
    sb.append(", companyemail=").append(companyemail).append('\'');
    sb.append(", name=").append(name).append('\'');
    sb.append(", password=").append(password).append('\'');
    sb.append(", imageCode=").append(imageCode).append('\'');
    sb.append(", imageCodeToken=").append(imageCodeToken).append('\'');
    sb.append('}');
return sb.toString();
}

}