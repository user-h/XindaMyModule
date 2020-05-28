package com.example.model;

import java.util.Date;

public class Provider {
    private String id;

    private String name;

    private String providerInfotouser;

    private String providerInfotoroot;

    private String cellphone;

    private String customServicenum;

    private String password;

    private String providerImg;

    private String regionId;

    private Date registerTime;

    private Integer status;

    private String authFile;

    private String weixin;

    private String qq;

    private String workTime;

    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProviderInfotouser() {
        return providerInfotouser;
    }

    public void setProviderInfotouser(String providerInfotouser) {
        this.providerInfotouser = providerInfotouser == null ? null : providerInfotouser.trim();
    }

    public String getProviderInfotoroot() {
        return providerInfotoroot;
    }

    public void setProviderInfotoroot(String providerInfotoroot) {
        this.providerInfotoroot = providerInfotoroot == null ? null : providerInfotoroot.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getCustomServicenum() {
        return customServicenum;
    }

    public void setCustomServicenum(String customServicenum) {
        this.customServicenum = customServicenum == null ? null : customServicenum.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getProviderImg() {
        return providerImg;
    }

    public void setProviderImg(String providerImg) {
        this.providerImg = providerImg == null ? null : providerImg.trim();
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuthFile() {
        return authFile;
    }

    public void setAuthFile(String authFile) {
        this.authFile = authFile == null ? null : authFile.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}