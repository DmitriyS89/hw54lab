package com.example.demo.repositories;


import com.example.demo.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {

    List<Subscription> findAll();

//    @Query(" { '$or' : [ { 'subscription.id' : ?0 }, { 'subscription.email' : ?1 } ] } ")
//    List<SubscriptionOnEvent> findByIdAndEmail(String id, String email);

    boolean existsByIdAndEmail(String id, String Email);
}