package com.example.demo.services;


import com.example.demo.dto.SubscriptionDTO;
import com.example.demo.model.Subscription;
import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;
    private final EventRepository eventRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository, EventRepository eventRepository) {
        this.subscriptionRepository = subscriptionRepository;
        this.eventRepository = eventRepository;
    }


    public void getSubscriptionsList() {
        subscriptionRepository.findAll();
    }
    public Subscription createSubscription(SubscriptionDTO subscriptionDTO) {
        Subscription subscription = Subscription.builder()
                .id(subscriptionDTO.getId())
                .event(subscriptionDTO.getEvent())
                .email(subscriptionDTO.getEmail())
                .regDateTime(subscriptionDTO.getRegDateTime())
                .build();
        subscriptionRepository.save(subscription);
        return subscription;

    }
}
