package com.club.system.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "event")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventid")
    int eventid;

    @ManyToOne
    @JoinColumn(name="clubid")
    private Club club;

    String  eventname;
    String  content;
    String  place;
    Timestamp  starttime;
    Timestamp  endtime;
    String  state;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "eventlogo",columnDefinition = "longblob",nullable = true)
    private  byte[] eventlogo;

    public byte[] getEventlogo() {
        return eventlogo;
    }

    public void setEventlogo(byte[] eventlogo) {
        this.eventlogo = eventlogo;
    }
}
