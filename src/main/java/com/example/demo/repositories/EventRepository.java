package com.example.demo.repositories;

import com.example.demo.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends PagingAndSortingRepository<Event, String> {

    List<Event> findAll();
    Optional<Event> findById(String id);
    Optional<Event> findEventByDateTimeAfter(LocalDateTime dateTime);
}