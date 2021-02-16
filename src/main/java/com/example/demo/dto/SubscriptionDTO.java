package com.example.demo.dto;

import com.example.demo.model.Event;
import com.example.demo.model.Subscription;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class SubscriptionDTO {
    public static SubscriptionDTO from(Subscription subscription) {
        return SubscriptionDTO.builder()
                .id(subscription.getId())
                .event(subscription.getEvent())
                .email(subscription.getEmail())
                .build();
    }


    private String id;
    private Event event;
    private String email;
    private LocalDateTime regDateTime;
}
