package com.csii.ants.management.server.domain;

import java.util.Date;

public class Employeeinfo {
    private String id;

    private String name;

    private String jobNum;

    private String base;

    private String companyemail;

    private String dependenceDep;

    private String superiordep;

    private String position;

    private String depDirector;

    private Date entryTime;

    private String entryType;

    private String entryAddress;

    private Date internshipbegin;

    private Date internshipending;

    private Date conversionregTime;

    private Date contractsigning;

    private Date contractending;

    private Date probationexpDate;

    private String employeestatus;

    private String contractrenew;

    private String welfarearea;

    private String myrole;

    private String employeeccc;

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