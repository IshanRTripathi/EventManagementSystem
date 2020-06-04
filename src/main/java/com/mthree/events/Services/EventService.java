package com.mthree.events.Services;

import com.mthree.events.Models.Event;
import com.mthree.events.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents()
    {
        List<Event> events= new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    public Event getEvent(String id)
    {
        return eventRepository.findById(id).orElse(null);
    }

    public void addEvent(Event event)
    {
        eventRepository.save(event);
    }

    public void updateEvent(Event event)
    {
        eventRepository.save(event);
    }

    public void deleteEvent(String id)
    {
        eventRepository.deleteById(id);
    }
}
