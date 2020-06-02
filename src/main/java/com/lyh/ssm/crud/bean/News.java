package com.lyh.ssm.crud.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class News {
    private Integer newsid;

//    private Integer clubid;

    private  Club club;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    private String newsname;

    private String content;

    private Date time;

    private byte[] newslogo;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

//    public Integer getClubid() {
//        return clubid;
//    }
//
//    public void setClubid(Integer clubid) {
//        this.clubid = clubid;
//    }

    public String getNewsname() {
        return newsname;
    }

    public void setNewsname(String newsname) {
        this.newsname = newsname == null ? null : newsname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public byte[] getNewslogo() {
        return newslogo;
    }

    public void setNewslogo(byte[] newslogo) {
        this.newslogo = newslogo;
    }
}
