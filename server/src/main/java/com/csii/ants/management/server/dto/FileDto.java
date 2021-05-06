package com.csii.ants.management.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class FileDto {

    /**
    * id
    */
    private String id;
    /**
    * 相对路径
    */
    private String path;
    /**
    * 文件名
    */
    private String name;
    /**
    * 后缀
    */
    private String suffix;
    /**
    * 大小|字节B
    */
    private Integer size;
    /**
    * 创建时间
    */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdAt;

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public String getPath() {
    return path;
    }

    public void setPath(String path) {
    this.path = path;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getSuffix() {
    return suffix;
    }

    public void setSuffix(String suffix) {
    this.suffix = suffix;
    }

    public Integer getSize() {
    return size;
    }

    public void setSize(Integer size) {
    this.size = size;
    }

    public Date getCreatedAt() {
    return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(getClass().getSimpleName());
sb.append(" [");
sb.append("Hash = ").append(hashCode());
    sb.append(", id=").append(id);
    sb.append(", path=").append(path);
    sb.append(", name=").append(name);
    sb.append(", suffix=").append(suffix);
    sb.append(", size=").append(size);
    sb.append(", createdAt=").append(createdAt);
sb.append("]");
return sb.toString();
}

}