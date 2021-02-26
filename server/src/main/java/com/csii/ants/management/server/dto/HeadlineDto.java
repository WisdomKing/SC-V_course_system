package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class HeadlineDto {

    /**
    * ID
    */
    private String id;
    /**
    * 上传时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdtime;
    /**
    * 修改时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedtime;
    /**
    * 详情
    */
    private String details;

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public Date getCreatedtime() {
    return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
    this.createdtime = createdtime;
    }

    public Date getUpdatedtime() {
    return updatedtime;
    }

    public void setUpdatedtime(Date updatedtime) {
    this.updatedtime = updatedtime;
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
    sb.append(", createdtime=").append(createdtime);
    sb.append(", updatedtime=").append(updatedtime);
    sb.append(", details=").append(details);
sb.append("]");
return sb.toString();
}

}