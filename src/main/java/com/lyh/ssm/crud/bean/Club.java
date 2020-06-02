package com.lyh.ssm.crud.bean;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

public class Club {
    private Integer clubid;

    private String clubname;

    private String introduce;

    private String founder;

    private Date createtime;

    private String state;

    private byte[] clublogo;

    public Integer getClubid() {
        return clubid;
    }

    public void setClubid(Integer clubid) {
        this.clubid = clubid;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname == null ? null : clubname.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public byte[] getClublogo() {
        return clublogo;
    }

    public void setClublogo(byte[] clublogo) {
        this.clublogo = clublogo;
    }
}
