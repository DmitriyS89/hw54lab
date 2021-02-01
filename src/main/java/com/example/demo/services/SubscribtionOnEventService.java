package com.example.demo.services;

import com.example.demo.repositories.SubscriptionOnRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscribtionOnEventService {
    private final SubscriptionOnRepository subscription;

    public SubscribtionOnEventService(SubscriptionOnRepository subscription) {
        this.subscription = subscription;
    }
}
