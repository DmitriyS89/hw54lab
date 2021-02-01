package com.example.demo.controllers;

import com.example.demo.services.SubscribtionOnEventService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")

public class SubscriptionController {
    private final SubscribtionOnEventService subscribtionOnEventService;

    public SubscriptionController(SubscribtionOnEventService subscribtionOnEventService) {
        this.subscribtionOnEventService = subscribtionOnEventService;
    }
}
