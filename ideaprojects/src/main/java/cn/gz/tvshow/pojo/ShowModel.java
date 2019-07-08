package cn.gz.tvshow.pojo;

import java.util.Date;

public class ShowModel {
    private Integer id;

    private String name;

    private String theme;

    private Integer Time;

    private String showCharacter;

    private String telephone;

    private String qr;

    private String namedAd;

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
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer time) {
        Time = time;
    }

    public String getShowCharacter() {
        return showCharacter;
    }

    public void setShowCharacter(String showCharacter) {
        this.showCharacter = showCharacter;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getNamedAd() {
        return namedAd;
    }

    public void setNamedAd(String namedAd) {
        this.namedAd = namedAd;
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
        return "ShowModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", Time=" + Time +
                ", showCharacter='" + showCharacter + '\'' +
                ", telephone='" + telephone + '\'' +
                ", qr='" + qr + '\'' +
                ", namedAd='" + namedAd + '\'' +
                ", upDate=" + upDate +
                ", upUserId=" + upUserId +
                '}';
    }
}