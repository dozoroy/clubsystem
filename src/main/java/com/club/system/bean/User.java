package com.club.system.bean;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sun.awt.image.IntegerInterleavedRaster;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    int userid;


    String username;
    String password;
    String type;
    String phone;

    Timestamp regtime;

    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password= password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getRegtime() {
        return regtime;
    }

    public void setRegtime(Timestamp regtime) {
        this.regtime = regtime;
    }


    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name="userlogo",columnDefinition = "longblob",nullable = true)
    private  byte[] UserLogo;

    public byte[] getUserLogo() {
        return UserLogo;
    }

    public void setUserLogo(byte[] userLogo) {
        UserLogo = userLogo;
    }
}
