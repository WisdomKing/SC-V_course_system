package com.csii.ants.management.server.dto;

public class AnnouncementDto {
    private String id;

    private String announcementtitle;

    private String announcementtype;

    private String begintime;

    private String endingtime;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", announcementtitle=").append(announcementtitle);
        sb.append(", announcementtype=").append(announcementtype);
        sb.append(", begintime=").append(begintime);
        sb.append(", endingtime=").append(endingtime);
        sb.append(", details=").append(details);
        sb.append("]");
        return sb.toString();
    }
}