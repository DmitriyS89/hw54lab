package com.example.demo.repositories;

import com.example.demo.model.SubscriptionOnEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionOnRepository extends CrudRepository<SubscriptionOnEvent, Integer> {

    List<SubscriptionOnEvent> findAll();
}