package com.club.system.controller;

import com.club.system.bean.Event;
import com.club.system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EventController {

    @Autowired
    EventService eventService;


   @GetMapping("/api/eventname/")
    public List<Event> findByEventnameContaining(String eventname){
       return  eventService.findByEventnameContaining(eventname);
   }

    @GetMapping("/api/events")
    public List<Event> eventlist() throws Exception {
        return eventService.list();
    }

    @PostMapping("/api/events")
    public Event addOrUpdate(@RequestBody Event event) throws Exception {
        eventService.addOrUpdate(event);
        return event;
    }

    @PostMapping("/api/events/delete")
    public void delete(@RequestBody Event event) throws Exception {
        eventService.deleteEvent(event);
    }

    @GetMapping("/api/clubs/{clubid}/events")
    public List<Event> listByClubEvents(@PathVariable("clubid") int clubid) throws Exception {
        if (0 != clubid) {
            return eventService.listByClubEvents(clubid);
        } else {
            return eventlist();
        }
    }

//    @GetMapping("/api/users/{userid}/events")
//    public List<Event> listByUserevents(@PathVariable("userid") int userid) throws Exception {
//        if (0 != userid) {
//            return eventService.listByUserEvents(userid);
//        } else {
//            return  eventlist();
//        }
//    }


    @GetMapping("/api/events/{eventid}")
    public  List<Event> eventList(@PathVariable("eventid")int eventid) throws  Exception{
        if(0 != eventid){
            return  eventService.listByEventid(eventid);
        }else {
            return eventlist();
        }
    }


    @PostMapping("/api/users/{userid}/events/{eventid}/delete")
    public void deleteUserEvents(@PathVariable("userid") int userid, @PathVariable("eventid") int eventid) throws Exception {
        eventService.delUserEvent(userid, eventid);
    }


}
