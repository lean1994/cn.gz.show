package cn.gz.tvshow.pojo;

import java.util.Date;

public class UserModel {
    private Integer id;
    private String name;
    private String gender;
    private String perName;
    private String password;
    private String authority;
    private String state;
    private String telephone;
    private String email;
    private Date regDate;
    private Date lastReg;
    private Integer loginNum;
    private String autRole;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastReg() {
        return lastReg;
    }

    public void setLastReg(Date lastReg) {
        this.lastReg = lastReg;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public String getAutRole() {
        return autRole;
    }

    public void setAutRole(String autRole) {
        this.autRole = autRole;
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
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", perName='" + perName + '\'' +
                ", password='" + password + '\'' +
                ", authority='" + authority + '\'' +
                ", state='" + state + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                ", lastReg=" + lastReg +
                ", loginNum=" + loginNum +
                ", autRole='" + autRole + '\'' +
                ", upDate=" + upDate +
                ", up_user_id='" + upUserId + '\'' +
                '}';
    }

    public UserModel(String name, String gender, String perName, String password, String authority, String state, String telephone, String email, Date regDate, Date lastReg, Integer loginNum, String autRole, Date upDate, Integer upUserId) {
        this.name = name;
        this.gender = gender;
        this.perName = perName;
        this.password = password;
        this.authority = authority;
        this.state = state;
        this.telephone = telephone;
        this.email = email;
        this.regDate = regDate;
        this.lastReg = lastReg;
        this.loginNum = loginNum;
        this.autRole = autRole;
        this.upDate = upDate;
        this.upUserId = upUserId;
    }

    public UserModel() {
    }
}
