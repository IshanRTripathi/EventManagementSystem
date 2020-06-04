package com.mthree.events.Repositories;

import com.mthree.events.Models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, String> {
}
