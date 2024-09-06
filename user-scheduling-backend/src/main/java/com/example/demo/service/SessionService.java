package com.example.demo.service;

import com.example.demo.model.Session;
import com.example.demo.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }

    // Other methods for updating, deleting, and retrieving sessions
}
