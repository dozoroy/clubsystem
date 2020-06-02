package com.lyh.ssm.crud.bean;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String phone;

    private Date regtime;

    private String type;

    private String mail;

    private byte[] userlogo;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public byte[] getUserlogo() {
        return userlogo;
    }

    public void setUserlogo(byte[] userlogo) {
        this.userlogo = userlogo;
    }
}
