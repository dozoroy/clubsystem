package com.club.system.bean;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "comment")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comid")
    int comid;

    @ManyToOne
    @JoinColumn(name="newsid")
    private News news;

    public News getNews(){
        return  news;
    }
    public void  setNews(News news){
        this.news=news;
    }

    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    public User getUser(){
        return  user;
    }
    public void setUser(User user){
        this.user=user;
    }

    String  content;


    public int getComid() {
        return comid;
    }

    public void setComid(int comid) {
        this.comid = comid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
