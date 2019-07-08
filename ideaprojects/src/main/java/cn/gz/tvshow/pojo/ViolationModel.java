package cn.gz.tvshow.pojo;

import java.util.Date;

public class ViolationModel {
    private Integer id;

    private String name;

    private String ViolationCategory;

    private String ViolationLevel;

    private Integer upUserId;

    private Date upDate;

    public Integer getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(Integer upUserId) {
        this.upUserId = upUserId;
    }

    public String getViolationCategory() {
        return ViolationCategory;
    }

    public void setViolationCategory(String violationCategory) {
        ViolationCategory = violationCategory;
    }

    public String getViolationLevel() {
        return ViolationLevel;
    }

    public void setViolationLevel(String violationLevel) {
        ViolationLevel = violationLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    @Override
    public String toString() {
        return "ViolationModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ViolationCategory=" + ViolationCategory +
                ", ViolationLevel='" + ViolationLevel + '\'' +
                ", upUserId='" + upUserId + '\'' +
                ", upDate=" + upDate +
                '}';
    }
}