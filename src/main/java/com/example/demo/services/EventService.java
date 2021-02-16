package com.example.demo.services;


import com.example.demo.dto.EventDTO;
import com.example.demo.model.Event;
import com.example.demo.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventDTO> getEvents() {
        List<Event> eventList = eventRepository.findAll();
        List<EventDTO> eventDTOList = new ArrayList<>();

        eventList.forEach(event -> {
            eventDTOList.add(EventDTO.builder()
                    .id(event.getId())
                    .dateTime(event.getDateTime())
                    .name(event.getName())
                    .description(event.getDescription())
                    .build());
        });
        return eventDTOList;
    }
}


