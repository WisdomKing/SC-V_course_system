package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ClockinDto {

    /**
    * ID
    */
    private String id;
    /**
    * 项目名称
    */
    private String projectname;
    /**
    * 工时类型|Delivery("D","交付项目"),Presale("P","售前项目"),Research("R","研发项目"),Inside("I","内部项目"),
    */
    private String manhourType;
    /**
    * 工时
    */
    private String manhour;
    /**
    * 延时
    */
    private String delayed;
    /**
    * 工作日志
    */
    private String worklog;
    /**
    * 状态|Approved("A","已审批"),Rejected("R","已拒绝"),Commit("C","已提交"),Saved("S","已保存"),Other("O","未报工")
    */
    private String status;
    /**
    * 报工时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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