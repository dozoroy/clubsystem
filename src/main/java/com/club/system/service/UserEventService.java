package com.club.system.service;

import com.club.system.bean.User;
import com.club.system.bean.Event;
import com.club.system.bean.UserEvent;
import com.club.system.dao.UserEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserEventService {

    @Autowired
    UserEventDAO userEventDAO;
    @Autowired
    UserService userService;
    @Autowired
    EventService eventService;

    public void addOrUpdate(UserEvent userEvent){
        userEventDAO.save(userEvent);
    }

    public List<UserEvent> list(){
        Sort sort =Sort.by(Sort.Direction.DESC,"id");
        return  userEventDAO.findAll(sort);
    }

    public  UserEvent get(int id){
        UserEvent ue=userEventDAO.findById(id).orElse(null);
        return  ue;
    }

    public List<UserEvent> listByUserUserEvents(int userid){
        User user = userService.get(userid);
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return  userEventDAO.findAllByUser(user);
    }

    public List<UserEvent> listByEventUserEvents(int eventid){
        Event event = eventService.get(eventid);
        Sort sort=Sort.by(Sort.Direction.DESC,"id");
        return  userEventDAO.findAllByEvent(event);
    }

    public void   deleteById(int id){
        userEventDAO.deleteById(id);
    }

}
