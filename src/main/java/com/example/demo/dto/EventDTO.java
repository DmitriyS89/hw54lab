package com.example.demo.dto;

import com.example.demo.model.Event;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public class EventDTO {
    private String id;
    private LocalDateTime dateTime;
    private String name;
    private String subscription;
}
