package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeinfoDto {

    /**
    * ID
    */
    private String id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 工号
    */
    private String jobNum;
    /**
    * 归属公司|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")
    */
    private String base;
    /**
    * 企业邮箱
    */
    private String companyemail;
    /**
    * 所属部门
    */
    private String dependenceDep;
    /**
    * 上级部门
    */
    private String superiordep;
    /**
    * 职位
    */
    private String position;
    /**
    * 部门总监
    */
    private String depDirector;
    /**
    * 入职时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entryTime;
    /**
    * 入职方式|Xiaozhao("X","校招"),Shezhao("S","社招")
    */
    private String entryType;
    /**
    * 入职地点|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")
    */
    private String entryAddress;
    /**
    * 实习起始日
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date internshipbegin;
    /**
    * 实习到期日
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date internshipending;
    /**
    * 转正日期
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date conversionregTime;
    /**
    * 合同签订日
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date contractsigning;
    /**
    * 合同截止日
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date contractending;
    /**
    * 试用到期日
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date probationexpDate;
    /**
    * 人员状态
    */
    private String employeestatus;
    /**
    * 合同续签
    */
    private String contractrenew;
    /**
    * 福利地区|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")
    */
    private String welfarearea;
    /**
    * 我的角色
    */
    private String myrole;
    /**
    * 员工CCC
    */
    private String employeeccc;
    /**
    * 备注
    */
    private String comment;

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

    public String getJobNum() {
    return jobNum;
    }

    public void setJobNum(String jobNum) {
    this.jobNum = jobNum;
    }

    public String getBase() {
    return base;
    }

    public void setBase(String base) {
    this.base = base;
    }

    public String getCompanyemail() {
    return companyemail;
    }

    public void setCompanyemail(String companyemail) {
    this.companyemail = companyemail;
    }

    public String getDependenceDep() {
    return dependenceDep;
    }

    public void setDependenceDep(String dependenceDep) {
    this.dependenceDep = dependenceDep;
    }

    public String getSuperiordep() {
    return superiordep;
    }

    public void setSuperiordep(String superiordep) {
    this.superiordep = superiordep;
    }

    public String getPosition() {
    return position;
    }

    public void setPosition(String position) {
    this.position = position;
    }

    public String getDepDirector() {
    return depDirector;
    }

    public void setDepDirector(String depDirector) {
    this.depDirector = depDirector;
    }

    public Date getEntryTime() {
    return entryTime;
    }

    public void setEntryTime(Date entryTime) {
    this.entryTime = entryTime;
    }

    public String getEntryType() {
    return entryType;
    }

    public void setEntryType(String entryType) {
    this.entryType = entryType;
    }

    public String getEntryAddress() {
    return entryAddress;
    }

    public void setEntryAddress(String entryAddress) {
    this.entryAddress = entryAddress;
    }

    public Date getInternshipbegin() {
    return internshipbegin;
    }

    public void setInternshipbegin(Date internshipbegin) {
    this.internshipbegin = internshipbegin;
    }

    public Date getInternshipending() {
    return internshipending;
    }

    public void setInternshipending(Date internshipending) {
    this.internshipending = internshipending;
    }

    public Date getConversionregTime() {
    return conversionregTime;
    }

    public void setConversionregTime(Date conversionregTime) {
    this.conversionregTime = conversionregTime;
    }

    public Date getContractsigning() {
    return contractsigning;
    }

    public void setContractsigning(Date contractsigning) {
    this.contractsigning = contractsigning;
    }

    public Date getContractending() {
    return contractending;
    }

    public void setContractending(Date contractending) {
    this.contractending = contractending;
    }

    public Date getProbationexpDate() {
    return probationexpDate;
    }

    public void setProbationexpDate(Date probationexpDate) {
    this.probationexpDate = probationexpDate;
    }

    public String getEmployeestatus() {
    return employeestatus;
    }

    public void setEmployeestatus(String employeestatus) {
    this.employeestatus = employeestatus;
    }

    public String getContractrenew() {
    return contractrenew;
    }

    public void setContractrenew(String contractrenew) {
    this.contractrenew = contractrenew;
    }

    public String getWelfarearea() {
    return welfarearea;
    }

    public void setWelfarearea(String welfarearea) {
    this.welfarearea = welfarearea;
    }

    public String getMyrole() {
    return myrole;
    }

    public void setMyrole(String myrole) {
    this.myrole = myrole;
    }

    public String getEmployeeccc() {
    return employeeccc;
    }

    public void setEmployeeccc(String employeeccc) {
    this.employeeccc = employeeccc;
    }

    public String getComment() {
    return comment;
    }

    public void setComment(String comment) {
    this.comment = comment;
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(getClass().getSimpleName());
sb.append(" [");
sb.append("Hash = ").append(hashCode());
    sb.append(", id=").append(id);
    sb.append(", name=").append(name);
    sb.append(", jobNum=").append(jobNum);
    sb.append(", base=").append(base);
    sb.append(", companyemail=").append(companyemail);
    sb.append(", dependenceDep=").append(dependenceDep);
    sb.append(", superiordep=").append(superiordep);
    sb.append(", position=").append(position);
    sb.append(", depDirector=").append(depDirector);
    sb.append(", entryTime=").append(entryTime);
    sb.append(", entryType=").append(entryType);
    sb.append(", entryAddress=").append(entryAddress);
    sb.append(", internshipbegin=").append(internshipbegin);
    sb.append(", internshipending=").append(internshipending);
    sb.append(", conversionregTime=").append(conversionregTime);
    sb.append(", contractsigning=").append(contractsigning);
    sb.append(", contractending=").append(contractending);
    sb.append(", probationexpDate=").append(probationexpDate);
    sb.append(", employeestatus=").append(employeestatus);
    sb.append(", contractrenew=").append(contractrenew);
    sb.append(", welfarearea=").append(welfarearea);
    sb.append(", myrole=").append(myrole);
    sb.append(", employeeccc=").append(employeeccc);
    sb.append(", comment=").append(comment);
sb.append("]");
return sb.toString();
}

}