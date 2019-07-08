package cn.gz.tvshow.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ShowPlayListModel {
    private Integer id;
    private Integer channelId;
    private Integer showId;

    private Date beginTime;

    private Date endTime;
    private Integer upUserId;
    private Date upDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        return "ShowPlayListModel{" +
                "id=" + id +
                ", channelId=" + channelId +
                ", showId=" + showId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", upUserId=" + upUserId +
                ", upDate=" + upDate +
                '}';
    }
}