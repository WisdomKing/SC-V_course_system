package com.csii.ants.management.server.domain;

import java.util.Date;

public class ReportWork {
    private String jobNum;

    private Date clockDate;

    private String clockState;

    private String proname;

    private String workingHours;

    private String delayed;

    private String details;

    private Date benginTime;

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