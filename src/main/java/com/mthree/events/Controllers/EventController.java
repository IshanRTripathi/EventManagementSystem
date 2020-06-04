package com.mthree.events.Controllers;

import com.mthree.events.Models.Event;
import com.mthree.events.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService service;

    @RequestMapping("/events")
    public List<Event> getAllEvents()
    {
        return service.getAllEvents();
    }

    @RequestMapping("/events/{id}")
    public Event getEvent(@PathVariable("id") String eventName)
    {
        return service.getEvent(eventName);
    }

    @RequestMapping(method = RequestMethod.POST,value="/events")
    public void addEvent(@RequestBody Event event)
    {
        service.addEvent(event);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/events/{id}")
    public void addEvent(@RequestBody Event event, @PathVariable String id)
    {
        service.updateEvent(event);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/events/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        service.deleteEvent(id);
    }
}
