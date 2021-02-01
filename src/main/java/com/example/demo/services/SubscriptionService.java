package com.example.demo.services;


import com.example.demo.repositories.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
    private final SubscriptionRepository subscription;

    public SubscriptionService(SubscriptionRepository subscription) {
        this.subscription = subscription;
    }

    public boolean createSubscription(String id, String email) {
        if()
        return true;
    }
}
