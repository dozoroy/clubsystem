package com.club.system.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "finace")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Finace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "finaid")
    int finaid;

    @ManyToOne
    @JoinColumn(name="clubid")
    private Club club;

    String  finaname;
    String  content;
    Float  money;


    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public int getFinaid() {
        return finaid;
    }

    public void setFinaid(int finaid) {
        this.finaid = finaid;
    }

    public String getFinaname() {
        return finaname;
    }

    public void setFinaname(String finaname) {
        this.finaname = finaname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
