package cn.gz.tvshow.pojo;

import java.util.Date;

public class AdvertisingModel {
    private Integer id;

    private String name;

    private String advertiser;

    private Integer adTime;

    private String type;

    private String adTelephone;

    private Date upDate;

    private Integer upUserId;

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

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser == null ? null : advertiser.trim();
    }

    public Integer getAdTime() {
        return adTime;
    }

    public void setAdTime(Integer adTime) {
        this.adTime = adTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAdTelephone() {
        return adTelephone;
    }

    public void setAdTelephone(String adTelephone) {
        this.adTelephone = adTelephone == null ? null : adTelephone.trim();
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
}