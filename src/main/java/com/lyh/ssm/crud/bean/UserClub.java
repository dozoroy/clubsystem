package com.lyh.ssm.crud.bean;

public class UserClub {
    private Integer id;


    private Club club;

    public void setClub(Club club) {
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

//    private Integer userid;
//
//    private Integer clubid;

    private String state;

    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }
//
//    public Integer getClubid() {
//        return clubid;
//    }
//
//    public void setClubid(Integer clubid) {
//        this.clubid = clubid;
//    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}
