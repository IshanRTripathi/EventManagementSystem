package com.mthree.users.Models;

import com.mthree.events.Models.Event;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

    @Id
    int id;
    String name;

    @ManyToOne
    Event event;

    public User(){}

    public User(int id, String name, Event event) {
        this.id = id;
        this.name = name;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
