package com.lyh.ssm.crud.bean;

public class Finace {
    private Integer finaid;

    private String finaname;

//    private Integer clubid;

    private  Club club;

    public void setClub(Club club) {
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    private String content;

    private Float money;

    public Integer getFinaid() {
        return finaid;
    }

    public void setFinaid(Integer finaid) {
        this.finaid = finaid;
    }

    public String getFinaname() {
        return finaname;
    }

    public void setFinaname(String finaname) {
        this.finaname = finaname == null ? null : finaname.trim();
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

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
