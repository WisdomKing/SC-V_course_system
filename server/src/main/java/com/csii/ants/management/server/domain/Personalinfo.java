package com.csii.ants.management.server.domain;

public class Personalinfo {
    private String id;

    private String name;

    private String sex;

    private String ethnicity;

    private String idnum;

    private String politicaloutlook;

    private String dateofbirth;

    private String personalemail;

    private String regisType;

    private String regisResidence;

    private String maritalstatus;

    private String gradUnversity;

    private String gradTime;

    private String speciality;

    private String degree;

    private String nativeplace;

    private String presentaddress;

    private String telephone;

    private String qqnum;

    private String wechat;

    private String emergencycontactrel;

    private String emergencycontactname;

    private String emergencycontacttel;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getPoliticaloutlook() {
        return politicaloutlook;
    }

    public void setPoliticaloutlook(String politicaloutlook) {
        this.politicaloutlook = politicaloutlook;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPersonalemail() {
        return personalemail;
    }

    public void setPersonalemail(String personalemail) {
        this.personalemail = personalemail;
    }

    public String getRegisType() {
        return regisType;
    }

    public void setRegisType(String regisType) {
        this.regisType = regisType;
    }

    public String getRegisResidence() {
        return regisResidence;
    }

    public void setRegisResidence(String regisResidence) {
        this.regisResidence = regisResidence;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getGradUnversity() {
        return gradUnversity;
    }

    public void setGradUnversity(String gradUnversity) {
        this.gradUnversity = gradUnversity;
    }

    public String getGradTime() {
        return gradTime;
    }

    public void setGradTime(String gradTime) {
        this.gradTime = gradTime;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getPresentaddress() {
        return presentaddress;
    }

    public void setPresentaddress(String presentaddress) {
        this.presentaddress = presentaddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQqnum() {
        return qqnum;
    }

    public void setQqnum(String qqnum) {
        this.qqnum = qqnum;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEmergencycontactrel() {
        return emergencycontactrel;
    }

    public void setEmergencycontactrel(String emergencycontactrel) {
        this.emergencycontactrel = emergencycontactrel;
    }

    public String getEmergencycontactname() {
        return emergencycontactname;
    }

    public void setEmergencycontactname(String emergencycontactname) {
        this.emergencycontactname = emergencycontactname;
    }

    public String getEmergencycontacttel() {
        return emergencycontacttel;
    }

    public void setEmergencycontacttel(String emergencycontacttel) {
        this.emergencycontacttel = emergencycontacttel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", ethnicity=").append(ethnicity);
        sb.append(", idnum=").append(idnum);
        sb.append(", politicaloutlook=").append(politicaloutlook);
        sb.append(", dateofbirth=").append(dateofbirth);
        sb.append(", personalemail=").append(personalemail);
        sb.append(", regisType=").append(regisType);
        sb.append(", regisResidence=").append(regisResidence);
        sb.append(", maritalstatus=").append(maritalstatus);
        sb.append(", gradUnversity=").append(gradUnversity);
        sb.append(", gradTime=").append(gradTime);
        sb.append(", speciality=").append(speciality);
        sb.append(", degree=").append(degree);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", presentaddress=").append(presentaddress);
        sb.append(", telephone=").append(telephone);
        sb.append(", qqnum=").append(qqnum);
        sb.append(", wechat=").append(wechat);
        sb.append(", emergencycontactrel=").append(emergencycontactrel);
        sb.append(", emergencycontactname=").append(emergencycontactname);
        sb.append(", emergencycontacttel=").append(emergencycontacttel);
        sb.append("]");
        return sb.toString();
    }
}