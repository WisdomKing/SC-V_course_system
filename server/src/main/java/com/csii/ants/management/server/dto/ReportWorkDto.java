package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ReportWorkDto {

    /**
    * 工号
    */
    private String jobNum;
    /**
    * 报工日期
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date clockDate;
    /**
    * 报工状态|01报工02请假
    */
    private String clockState;
    /**
    * 项目组名称
    */
    private String proname;
    /**
    * 工时
    */
    private String workingHours;
    /**
    * 延时
    */
    private String delayed;
    /**
    * 工作日志、请假理由
    */
    private String details;
    /**
    * 开始时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date benginTime;
    /**
    * 结束时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endingTime;

    public String getJobNum() {
    return jobNum;
    }

    public void setJobNum(String jobNum) {
    this.jobNum = jobNum;
    }

    public Date getClockDate() {
    return clockDate;
    }

    public void setClockDate(Date clockDate) {
    this.clockDate = clockDate;
    }

    public String getClockState() {
    return clockState;
    }

    public void setClockState(String clockState) {
    this.clockState = clockState;
    }

    public String getProname() {
    return proname;
    }

    public void setProname(String proname) {
    this.proname = proname;
    }

    public String getWorkingHours() {
    return workingHours;
    }

    public void setWorkingHours(String workingHours) {
    this.workingHours = workingHours;
    }

    public String getDelayed() {
    return delayed;
    }

    public void setDelayed(String delayed) {
    this.delayed = delayed;
    }

    public String getDetails() {
    return details;
    }

    public void setDetails(String details) {
    this.details = details;
    }

    public Date getBenginTime() {
    return benginTime;
    }

    public void setBenginTime(Date benginTime) {
    this.benginTime = benginTime;
    }

    public Date getEndingTime() {
    return endingTime;
    }

    public void setEndingTime(Date endingTime) {
    this.endingTime = endingTime;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
            sb.append(", jobNum=").append(jobNum);
            sb.append(", clockDate=").append(clockDate);
            sb.append(", clockState=").append(clockState);
            sb.append(", proname=").append(proname);
            sb.append(", workingHours=").append(workingHours);
            sb.append(", delayed=").append(delayed);
            sb.append(", details=").append(details);
            sb.append(", benginTime=").append(benginTime);
            sb.append(", endingTime=").append(endingTime);
        sb.append("]");
        return sb.toString();
    }

}