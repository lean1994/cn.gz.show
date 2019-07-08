package cn.gz.tvshow.pojo;

import java.util.Date;

public class ShowAdvertisingModel {
    private Integer id;

    private Integer advertiserId;

    private Integer showId;

    private Date upDate;

    private Integer upUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

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

    public ShowAdvertisingModel(Integer id, Integer advertiserId, Integer showId, Date upDate, Integer upUserId) {
        this.id = id;
        this.advertiserId = advertiserId;
        this.showId = showId;
        this.upDate = upDate;
        this.upUserId = upUserId;
    }

    public ShowAdvertisingModel() {
    }

    @Override
    public String toString() {
        return "ShowAdvertisingModel{" +
                "id=" + id +
                ", advertiserId=" + advertiserId +
                ", showId=" + showId +
                ", upDate=" + upDate +
                ", upUserId=" + upUserId +
                '}';
    }
}