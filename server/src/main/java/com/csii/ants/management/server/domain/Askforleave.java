package com.csii.ants.management.server.domain;

import java.util.Date;

public class Askforleave {
    private String id;

    private String jobNum;

    private String leavetype;

    private Date leavetimebengin;

    private Date leavetimeending;

    private String leavestatus;

    private String cancellationleave;

    private String details;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public Date getLeavetimebengin() {
        return leavetimebengin;
    }

    public void setLeavetimebengin(Date leavetimebengin) {
        this.leavetimebengin = leavetimebengin;
    }

    public Date getLeavetimeending() {
        return leavetimeending;
    }

    public void setLeavetimeending(Date leavetimeending) {
        this.leavetimeending = leavetimeending;
    }

    public String getLeavestatus() {
        return leavestatus;
    }

    public void setLeavestatus(String leavestatus) {
        this.leavestatus = leavestatus;
    }

    public String getCancellationleave() {
        return cancellationleave;
    }

    public void setCancellationleave(String cancellationleave) {
        this.cancellationleave = cancellationleave;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jobNum=").append(jobNum);
        sb.append(", leavetype=").append(leavetype);
        sb.append(", leavetimebengin=").append(leavetimebengin);
        sb.append(", leavetimeending=").append(leavetimeending);
        sb.append(", leavestatus=").append(leavestatus);
        sb.append(", cancellationleave=").append(cancellationleave);
        sb.append(", details=").append(details);
        sb.append("]");
        return sb.toString();
    }
}