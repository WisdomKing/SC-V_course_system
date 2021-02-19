package com.csii.ants.management.server.domain;

import java.util.Date;

public class Announcement {
    private String announcementtitle;

    private String announcementtype;

    private Date begintime;

    private Date endingtime;

    private String details;

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

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(Date endingtime) {
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
        sb.append(", announcementtitle=").append(announcementtitle);
        sb.append(", announcementtype=").append(announcementtype);
        sb.append(", begintime=").append(begintime);
        sb.append(", endingtime=").append(endingtime);
        sb.append(", details=").append(details);
        sb.append("]");
        return sb.toString();
    }
}