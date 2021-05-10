package com.csii.ants.management.server.dto;


public class AnnouncementDto {

    /**
    * ID
    */
    private String id;
    /**
    * 公告标题
    */
    private String announcementtitle;
    /**
    * 公告类型
    */
    private String announcementtype;
    /**
    * 开始时间
    */
    private String begintime;
    /**
    * 结束时间
    */
    private String endingtime;
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

    public String getAnnouncementtitle() {
        return announcementtitle;
    }

    public void setAnnouncementtitle(String announcementtitle) {
        this.announcementtitle = announcementtitle;
    }

    public String getAnnouncementtype() {
        return announcementtype;
    }

    public void setAnnouncementtype(String announcementtype) {
        this.announcementtype = announcementtype;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(String endingtime) {
        this.endingtime = endingtime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnnouncementDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", announcementtitle='").append(announcementtitle).append('\'');
        sb.append(", announcementtype='").append(announcementtype).append('\'');
        sb.append(", begintime='").append(begintime).append('\'');
        sb.append(", endingtime='").append(endingtime).append('\'');
        sb.append(", details='").append(details).append('\'');
        sb.append('}');
        return sb.toString();
    }

}