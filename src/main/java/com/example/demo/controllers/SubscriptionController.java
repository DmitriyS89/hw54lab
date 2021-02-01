package com.example.demo.controllers;

import com.example.demo.services.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriptions")

public class SubscriptionController {
    private final SubscriptionService subscribtionOnEventService;

    public SubscriptionController(SubscriptionService subscribtionOnEventService) {
        this.subscribtionOnEventService = subscribtionOnEventService;
    }

    @PostMapping
    public ResponseEntity<Void> subscribe(@RequestParam String id, @RequestParam String email) {
        if(SubscriptionService.createSubscription(id, email)) {

        }
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteReview(@PathVariable String id) {
//        if (reviewService.deleteReview(id))
//            return ResponseEntity.noContent().build();
//
//        return ResponseEntity.notFound().build();
}
