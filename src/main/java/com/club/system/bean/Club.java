package com.club.system.bean;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "club")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })

public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clubid")
    int clubid;


    String clubname;
    String introduce;
    String founder;
    Timestamp createtime;
    String state;


    public int getClubid() {
        return clubid;
    }

    public void setClubid(int clubid) {
        this.clubid = clubid;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name="clublogo",columnDefinition = "longblob",nullable = true)
    private  byte[] ClubLogo;

    public byte[] getClubLogo() {
        return ClubLogo;
    }

    public void setClubLogo(byte[] clubLogo) {
        ClubLogo = clubLogo;
    }
}
