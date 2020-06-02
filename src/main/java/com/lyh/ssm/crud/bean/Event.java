package com.lyh.ssm.crud.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Event {
    private Integer eventid;

    private String eventname;

//    private Integer clubid;

    private  Club club;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    private String content;

    private String place;

    private Date starttime;

    private String state;

    private Date endtime;

    private byte[] eventlogo;

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname == null ? null : eventname.trim();
    }

//    public Integer getClubid() {
//        return clubid;
//    }
//
//    public void setClubid(Integer clubid) {
//        this.clubid = clubid;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public byte[] getEventlogo() {
        return eventlogo;
    }

    public void setEventlogo(byte[] eventlogo) {
        this.eventlogo = eventlogo;
    }
}
