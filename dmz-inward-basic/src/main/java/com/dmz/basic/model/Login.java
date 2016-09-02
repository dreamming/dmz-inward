package com.dmz.basic.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Login {

    private Long id;


    private String userNo;


    private String loginName;


    private String passwd;


    private Integer platform;


    private Integer hasPasswd;


    private Integer pwdStrength;


    private Integer status;


    private Boolean isDelete;


    private Date createTime;


    private Date updateTime;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUserNo() {
        return userNo;
    }


    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }


    public String getLoginName() {
        return loginName;
    }


    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPasswd() {
        return passwd;
    }


    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public Integer getPlatform() {
        return platform;
    }


    public void setPlatform(Integer platform) {
        this.platform = platform;
    }


    public Integer getHasPasswd() {
        return hasPasswd;
    }


    public void setHasPasswd(Integer hasPasswd) {
        this.hasPasswd = hasPasswd;
    }


    public Integer getPwdStrength() {
        return pwdStrength;
    }


    public void setPwdStrength(Integer pwdStrength) {
        this.pwdStrength = pwdStrength;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    public Boolean getIsDelete() {
        return isDelete;
    }


    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }


    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}