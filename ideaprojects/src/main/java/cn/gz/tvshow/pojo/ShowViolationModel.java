package cn.gz.tvshow.pojo;

import java.util.Date;

public class ShowViolationModel {
    private Integer id;

    private Integer violationsId;

    private Integer showId;

    private Integer upUserId;

    private Date upDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViolationsId() {
        return violationsId;
    }

    public void setViolationsId(Integer violationsId) {
        this.violationsId = violationsId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(Integer upUserId) {
        this.upUserId = upUserId;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    @Override
    public String toString() {
        return "ShowViolationModel{" +
                "id=" + id +
                ", violationsId=" + violationsId +
                ", showId=" + showId +
                ", upUserId=" + upUserId +
                ", upDate=" + upDate +
                '}';
    }
}