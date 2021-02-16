package com.example.demo.controllers;

import com.example.demo.dto.AnswerDTO;
import com.example.demo.dto.EventDTO;
import com.example.demo.dto.SubscriptionDTO;
import com.example.demo.model.Subscription;
import com.example.demo.repositories.SubscriptionRepository;
import com.example.demo.services.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")

public class SubscriptionController {
    private final SubscriptionService subscriptionService;
    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionController(SubscriptionService subscriptionService, SubscriptionRepository subscriptionRepository) {
        this.subscriptionService = subscriptionService;
        this.subscriptionRepository = subscriptionRepository;
    }


    @GetMapping
    public void getSubscriptionsList() {
        subscriptionService.getSubscriptionsList();
    }

    @PostMapping
    public ResponseEntity<AnswerDTO> subscribe(@RequestBody SubscriptionDTO subscriptionDTO,
                                               @RequestParam EventDTO eventDTO) {
        if(!subscriptionRepository.existsByIdAndEmail(subscriptionDTO.getEmail(), eventDTO.getId())) {
            Subscription subscription = subscriptionService.createSubscription(subscriptionDTO);

            return ResponseEntity.status(201).body(AnswerDTO.builder()
                    .eventId(subscription.getId())
                    .message("Вы подписались на данное событие")
                    .build());
    } else {
        return ResponseEntity.badRequest().body(AnswerDTO.builder()
                .message("Вы уже подписаны на это событие")
                .build());
    }
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSubscription() {}
//
}
