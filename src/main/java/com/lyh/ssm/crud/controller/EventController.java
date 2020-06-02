package com.lyh.ssm.crud.controller;

import com.lyh.ssm.crud.bean.Event;
import com.lyh.ssm.crud.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/api/eventname/")
    public List<Event> findByEventname(String eventname){
        return  eventService.findByEventname(eventname);
    }

    @GetMapping("/api/events")
    public List<Event> eventlist() throws Exception {
        return eventService.list();
    }

    @PostMapping("/api/events")
    public Event addEvent(@RequestBody Event event) throws  Exception{
        eventService.addEvent(event);
        return event;
    }

    @GetMapping("/api/users/{userid}/event")
    public  List<Event> eventslists(@PathVariable("userid")int userid) throws Exception{
        return eventService.findEventByUser(userid);
    }

    @PutMapping("/api/events")
    public Event updateEvent(@RequestBody Event event) throws Exception {
        eventService.updateEvent(event);
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
