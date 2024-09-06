package com.example.demo.repository;

import com.example.demo.model.Availability;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvailabilityRepository extends MongoRepository<Availability, String> {
    // Custom queries if needed
}
