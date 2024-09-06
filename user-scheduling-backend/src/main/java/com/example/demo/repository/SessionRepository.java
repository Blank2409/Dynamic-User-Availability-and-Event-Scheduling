package com.example.demo.repository;

import com.example.demo.model.Session;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SessionRepository extends MongoRepository<Session, String> {
    // Custom queries if needed
}
