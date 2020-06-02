package com.lyh.ssm.crud.service;

import com.lyh.ssm.crud.bean.Event;
import com.lyh.ssm.crud.bean.EventExample;
import com.lyh.ssm.crud.bean.UserEventExample;
import com.lyh.ssm.crud.dao.EventMapper;
import com.lyh.ssm.crud.dao.UserEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private UserEventMapper userEventMapper;


    public List<Event> list(){
        return  eventMapper.selectAll();
    }

    public  void  addEvent(Event event){
        eventMapper.insert(event);
    }

    public void  updateEvent(Event event){
        eventMapper.updateByPrimaryKeySelective(event);
    }

    public void   deleteById(int eventid){
        eventMapper.deleteByPrimaryKey(eventid);
    }

    public List<Event> listByClubEvents(int clubid){
        EventExample eventExample = new EventExample();
        EventExample.Criteria criteria =eventExample.createCriteria();
        criteria.andClubidEqualTo(clubid);
        return eventMapper.selectByExampleWithBLOBs(eventExample);
    }

    public Event get(int eventid) {
        Event  e=eventMapper.selectByPrimaryKey(eventid);
        return  e;
    }


    public  List<Event> findByEventname(String eventname){
        EventExample eventExample = new EventExample();
        EventExample.Criteria criteria = eventExample.createCriteria();
        criteria.andEventnameLike("%"+eventname+"%");
        return eventMapper.selectByExampleWithBLOBs(eventExample);

    }

    public  List<Event> listByEventid(int eventid){
        List<Event> events = new ArrayList<Event>();
        events.add(eventMapper.selectByPrimaryKey(eventid));
        return  events;
    }

    public void  deleteEvent(Event event){
        UserEventExample userEventExample= new UserEventExample();
        UserEventExample.Criteria criteria= userEventExample.createCriteria();
        criteria.andEventidEqualTo(event.getEventid());
        userEventMapper.deleteByExample(userEventExample);
        eventMapper.deleteByPrimaryKey(event.getEventid());
    }


    public void delUserEvent(int userid,int eventid){
        UserEventExample userEventExample= new UserEventExample();
        UserEventExample.Criteria criteria= userEventExample.createCriteria();
        criteria.andEventidEqualTo(eventid);
        criteria.andUseridEqualTo(userid);
        userEventMapper.deleteByExample(userEventExample);
    }

    public List<Event> findEventByUser(int userid){
        return    eventMapper.selectEventByUser(userid);
    }

}
