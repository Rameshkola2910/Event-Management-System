/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */
package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.*;

import java.util.ArrayList;
import java.util.List;

public interface EventRepository {

    ArrayList<Event> getEvents();

    Event getEventById(int eventId);

    Event addEvent(Event event);

    Event updateEvent(int eventId, Event event);

    void deleteEvent(int eventId);

    List<Sponsor> getEventSponsors(int eventId);

}