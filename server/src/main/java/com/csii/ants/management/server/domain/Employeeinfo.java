package com.csii.ants.management.server.domain;

public class Employeeinfo {
    private String id;

    private String name;

    private String jobNum;

    private String base;

    private String companyemail;

    private String dependenceDep;

    private String position;

    private String depDirector;

    private String entryType;

    private String entryAddress;

    private String internshipbegin;

    private String internshipending;

    private String conversionregTime;

    private String contractsigning;

    private String contractending;

    private String welfarearea;

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

    public String getInternshipbegin() {
        return internshipbegin;
    }

    public void setInternshipbegin(String internshipbegin) {
        this.internshipbegin = internshipbegin;
    }

    public String getInternshipending() {
        return internshipending;
    }

    public void setInternshipending(String internshipending) {
        this.internshipending = internshipending;
    }

    public String getConversionregTime() {
        return conversionregTime;
    }

    public void setConversionregTime(String conversionregTime) {
        this.conversionregTime = conversionregTime;
    }

    public String getContractsigning() {
        return contractsigning;
    }

    public void setContractsigning(String contractsigning) {
        this.contractsigning = contractsigning;
    }

    public String getContractending() {
        return contractending;
    }

    public void setContractending(String contractending) {
        this.contractending = contractending;
    }

    public String getWelfarearea() {
        return welfarearea;
    }

    public void setWelfarearea(String welfarearea) {
        this.welfarearea = welfarearea;
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
        sb.append(", position=").append(position);
        sb.append(", depDirector=").append(depDirector);
        sb.append(", entryType=").append(entryType);
        sb.append(", entryAddress=").append(entryAddress);
        sb.append(", internshipbegin=").append(internshipbegin);
        sb.append(", internshipending=").append(internshipending);
        sb.append(", conversionregTime=").append(conversionregTime);
        sb.append(", contractsigning=").append(contractsigning);
        sb.append(", contractending=").append(contractending);
        sb.append(", welfarearea=").append(welfarearea);
        sb.append("]");
        return sb.toString();
    }
}