package com.club.system.controller;



import com.club.system.bean.User;
import com.club.system.bean.UserEvent;
import com.club.system.service.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserEventController {

    @Autowired
    UserEventService userEventService;

    @GetMapping("/api/userevents")
    public  List<UserEvent> usereventslist() throws  Exception{
        return  userEventService.list();
    }

    @PostMapping("/api/userevents")
    public UserEvent addOrUpdate(@RequestBody UserEvent userEvent) throws Exception {
        userEventService.addOrUpdate(userEvent);
        return userEvent;
    }

    @PostMapping("/api/userevents/delete")
    public void delete(@RequestBody UserEvent userEvent) throws Exception {
        userEventService.deleteById(userEvent.getId());
    }

    @GetMapping("/api/{eventid}/state")
    public List<UserEvent> listByUserEventStates(@PathVariable("eventid")int eventid) throws Exception{
        if(0!=eventid){
            return  userEventService.listByEventUserEvents(eventid);
        }else {
            return  usereventslist();
        }
    }

    @GetMapping("/api/{userid}/mystate")
    public  List<UserEvent> listByUserEventmyStates(@PathVariable("userid")int userid) throws Exception{
        if(0!=userid){
            return  userEventService.listByUserUserEvents(userid);
        }else{
            return  usereventslist();
        }
    }

}
