package com.csii.ants.management.server.domain;

import java.util.Date;

public class Clockin {
    private String id;

    private String projectname;

    private String manhourType;

    private String manhour;

    private String delayed;

    private String worklog;

    private String status;

    private Date clockinTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getManhourType() {
        return manhourType;
    }

    public void setManhourType(String manhourType) {
        this.manhourType = manhourType;
    }

    public String getManhour() {
        return manhour;
    }

    public void setManhour(String manhour) {
        this.manhour = manhour;
    }

    public String getDelayed() {
        return delayed;
    }

    public void setDelayed(String delayed) {
        this.delayed = delayed;
    }

    public String getWorklog() {
        return worklog;
    }

    public void setWorklog(String worklog) {
        this.worklog = worklog;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getClockinTime() {
        return clockinTime;
    }

    public void setClockinTime(Date clockinTime) {
        this.clockinTime = clockinTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectname=").append(projectname);
        sb.append(", manhourType=").append(manhourType);
        sb.append(", manhour=").append(manhour);
        sb.append(", delayed=").append(delayed);
        sb.append(", worklog=").append(worklog);
        sb.append(", status=").append(status);
        sb.append(", clockinTime=").append(clockinTime);
        sb.append("]");
        return sb.toString();
    }
}