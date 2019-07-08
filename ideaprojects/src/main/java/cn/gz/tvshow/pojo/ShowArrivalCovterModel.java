package cn.gz.tvshow.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

public class ShowArrivalCovterModel {

    private Integer showId;

    private Integer channelId;

    private Date beginTime;

    private Date endTime;

    private String terminalName;

    private Integer covterNum;

    private Integer terminalSum;

    private Double arrivalRate;

    private Integer spreadTerminal;

    private Integer spreadAllTv;

    private Integer spreadPopulation;

    private Date upDate;

    private Integer upUserId;

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
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

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public Integer getCovterNum() {
        return covterNum;
    }

    public void setCovterNum(Integer covterNum) {
        this.covterNum = covterNum;
    }

    public Integer getTerminalSum() {
        return terminalSum;
    }

    public void setTerminalSum(Integer terminalSum) {
        this.terminalSum = terminalSum;
    }

    public Double getArrivalRate() {
        return arrivalRate;
    }

    public void setArrivalRate(Double arrivalRate) {
        this.arrivalRate = arrivalRate;
    }

    public Integer getSpreadTerminal() {
        return spreadTerminal;
    }

    public void setSpreadTerminal(Integer spreadTerminal) {
        this.spreadTerminal = spreadTerminal;
    }

    public Integer getSpreadAllTv() {
        return spreadAllTv;
    }

    public void setSpreadAllTv(Integer spreadAllTv) {
        this.spreadAllTv = spreadAllTv;
    }

    public Integer getSpreadPopulation() {
        return spreadPopulation;
    }

    public void setSpreadPopulation(Integer spreadPopulation) {
        this.spreadPopulation = spreadPopulation;
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

    @Override
    public String toString() {
        return "ShowArrivalCovterModel{" +
                "showId=" + showId +
                ", channelId=" + channelId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", terminalName='" + terminalName + '\'' +
                ", covterNum=" + covterNum +
                ", terminalSum=" + terminalSum +
                ", arrivalRate=" + arrivalRate +
                ", spreadTerminal=" + spreadTerminal +
                ", spreadAllTv=" + spreadAllTv +
                ", spreadPopulation=" + spreadPopulation +
                ", upDate=" + upDate +
                ", upUserId=" + upUserId +
                '}';
    }
}