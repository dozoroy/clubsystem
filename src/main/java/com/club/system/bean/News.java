package com.club.system.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;
import java.sql.Timestamp;

@Entity
@Table(name = "news")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "newsid")
    int newsid;

    @ManyToOne
    @JoinColumn(name="clubid")
    private Club club;

    String  newsname;
    String  content;
    Timestamp  time;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getNewsname() {
        return newsname;
    }

    public void setNewsname(String newsname) {
        this.newsname = newsname;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name="newslogo",columnDefinition ="longblob",nullable =true)
    private  byte[] NewsLogo;

    public byte[] getNewsLogo() {
        return NewsLogo;
    }

    public void  setNewsLogo(byte[] newsLogo) {
        NewsLogo = newsLogo;
    }
}
