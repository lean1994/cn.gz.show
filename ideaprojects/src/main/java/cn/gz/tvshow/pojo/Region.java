package cn.gz.tvshow.pojo;

import java.util.Date;

public class Region {
    private Integer id;

    private String name;

    private String regionShortName;

    private String regionCode;

    private Date upDate;

    private Integer upUserId;

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public Integer getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(Integer upUserId) {
        this.upUserId = upUserId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRegionShortName() {
        return regionShortName;
    }

    public void setRegionShortName(String regionShortName) {
        this.regionShortName = regionShortName == null ? null : regionShortName.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regionShortName='" + regionShortName + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", upDate=" + upDate +
                ", upUserId='" + upUserId + '\'' +
                '}';
    }
}