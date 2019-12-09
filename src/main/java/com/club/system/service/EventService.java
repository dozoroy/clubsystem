package com.club.system.service;

import com.club.system.bean.User;
import com.club.system.dao.EventDAO;
import com.club.system.bean.Event;
import com.club.system.bean.Club;
import com.club.system.dao.UserEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventDAO eventDAO;
    @Autowired
    UserEventDAO userEventDAO;
    @Autowired
    ClubService clubService;
    @Autowired
    UserService userService;


    public List<Event> list(){
        Sort sort =  Sort.by(Sort.Direction.DESC,"eventid");
        return  eventDAO.findAll(sort);
    }
    public  void  addOrUpdate(Event event){
        eventDAO.save(event);
    }
    public void   deleteById(int eventid){
        eventDAO.deleteById(eventid);
    }
    public List<Event> listByClubEvents(int clubid){
        Club club = clubService.get(clubid);
        Sort sort = Sort.by(Sort.Direction.DESC,"eventid");
        return  eventDAO.findALLByClub(club);
    }

    public Event get(int eventid) {
        Event  e=eventDAO.findById(eventid).orElse(null);
        return  e;
    }


    public  List<Event> findByEventnameContaining(String eventname){
        Sort sort =Sort.by(Sort.Direction.DESC,"eventid");
        return eventDAO.findByEventnameContaining(eventname);
    }

    public  List<Event> listByEventid(int eventid){
        return  eventDAO.findByEventid(eventid);
    }

    public void  deleteEvent(Event event){
        userEventDAO.deleteByEvent(event);
        eventDAO.deleteById(event.getEventid());
    }


    public void delUserEvent(int userid,int eventid){  userEventDAO.delUserEvent(userid,eventid);}

}
