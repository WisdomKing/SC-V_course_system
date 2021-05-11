package com.csii.ants.management.server.domain;

public class Project {
    private String proid;

    private String proname;

    private String depid;

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proid=").append(proid);
        sb.append(", proname=").append(proname);
        sb.append(", depid=").append(depid);
        sb.append("]");
        return sb.toString();
    }
}