package com.csii.ants.management.server.dto;


public class PersonalinfoDto {

    /**
    * ID
    */
    private String id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 性别|Man("M","男"),Woman("W","女")
    */
    private String sex;
    /**
    * 民族
    */
    private String ethnicity;
    /**
    * 身份证号
    */
    private String idnum;
    /**
    * 政治面貌|Masses("Q","群众"),League("T","团员"),Probationary("Y","预备党员"),Party("D","党员")
    */
    private String politicaloutlook;
    /**
    * 出生日期
    */
    private String dateofbirth;
    /**
    * 个人邮箱
    */
    private String personalemail;
    /**
    * 户口性质
    */
    private String regisType;
    /**
    * 户口所在地
    */
    private String regisResidence;
    /**
    * 婚否|Yes("Y","是"),No("N","否")
    */
    private String maritalstatus;
    /**
    * 毕业院校
    */
    private String gradUnversity;
    /**
    * 毕业时间
    */
    private String gradTime;
    /**
    * 专业
    */
    private String speciality;
    /**
    * 学历|Primary("P","小学学历"),Junior("J","初中学历"),Highschool("H","高中学历"),College("C","专科学历"),Bachelor("B","本科学历"),Master("M","硕士学历"),Doctoral("D","博士学历"),Noeducation("N","无学历")
    */
    private String degree;
    /**
    * 籍贯|Anhui("AH","安徽"),Beijing("BJ","北京"),Fujian("FJ","福建"),Gansu("GS","甘肃"),Guangdong("GD","广东"),Guangxi("GX","广西"),Guizhou("GZ","贵州"),Hainan("HI","海南"),Hebei("HE","河北"),Henan("HA","河南"),Heilongjiang("HL","黑龙江"),Hubei("HB","湖北"),Hunan("HN","湖南"),Jilin("JL","吉林"),Jiangsu("JS","江苏"),Jiangxi("JX","江西"),Liaoning("LN","辽宁"),InnerMongoria("IM","内蒙古自治区"),Ningxia("NX","宁夏"),Qinghai("QH","青海"),Shandong("SD","山东"),Shanxi("SX","山西"),Shaanxi("SN","陕西"),Shanghai("SH","上海"),Sichuan("SC","四川"),Tianjing("TJ","天津"),Tibet("XZ","西藏"),Xinjiang("XJ","新疆"),Yunnan("YN","云南"),Zhejiang("ZJ","浙江"),Chongqing("CQ","重庆"),Macao("MO","澳门"),HongKong("HK","香港"),Taiwan("TW","台湾")
    */
    private String nativeplace;
    /**
    * 现住址
    */
    private String presentaddress;
    /**
    * 手机号
    */
    private String telephone;
    /**
    * qq号
    */
    private String qqnum;
    /**
    * 微信
    */
    private String wechat;
    /**
    * 紧急联系人关系|Father("F","父母"),Spouse("S","伴侣"),Children("C","子女"),Otherrelatives("O","其他亲戚"),Friend("F","朋友")
    */
    private String emergencycontactrel;
    /**
    * 紧急联系人姓名
    */
    private String emergencycontactname;
    /**
    * 紧急联系人电话
    */
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