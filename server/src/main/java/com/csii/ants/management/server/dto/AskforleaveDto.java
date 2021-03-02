package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AskforleaveDto {

    /**
    * ID
    */
    private String id;
    /**
    * 工号
    */
    private String jobNum;
    /**
    * 请假类型|Annual("N","年假"),Personal("S","事假"),Sick("B","病假"),Marriage("H","婚假"),Maternity("C","产假"),Paternity("P","陪产假"),Condole("W","慰唁假"),Antenatal("J","产检假")
    */
    private String leavetype;
    /**
    * 请假时间开始
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date leavetimebengin;
    /**
    * 请假时间结束
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date leavetimeending;
    /**
    * 请假审批状态|Approved("A","已审批"),Rejected("R","已拒绝"),Commit("C","已提交"),Saved("S","已保存"),Process("P","流程中")
    */
    private String leavestatus;
    /**
    * 是否销假|Yes("Y","是"),No("N","否")
    */
    private String cancellationleave;
    /**
    * 请假说明
    */
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