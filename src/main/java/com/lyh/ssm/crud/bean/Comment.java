package com.lyh.ssm.crud.bean;


public class Comment {
    private Integer comid;

//    private Integer userid;

    private  User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    //    private Integer newsid;

    private  News news;

    public void setNews(News news) {
        this.news = news;
    }

    public News getNews() {
        return news;
    }

    private Integer likecount;

    private String content;

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

//    public Integer getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }
//
//    public Integer getNewsid() {
//        return newsid;
//    }
//
//    public void setNewsid(Integer newsid) {
//        this.newsid = newsid;
//    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
