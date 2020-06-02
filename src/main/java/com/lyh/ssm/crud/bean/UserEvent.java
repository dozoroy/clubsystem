package com.lyh.ssm.crud.bean;

public class UserEvent {
    private Integer id;

//    private Integer userid;
////
////    private Integer eventid;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    private Event event;

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    private String state;

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
//    public Integer getEventid() {
//        return eventid;
//    }
//
//    public void setEventid(Integer eventid) {
//        this.eventid = eventid;
//    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}
