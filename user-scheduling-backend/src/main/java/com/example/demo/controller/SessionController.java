package com.example.demo.controller;

import com.example.demo.model.Session;
import com.example.demo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session createSession(@RequestBody Session session) {
        return sessionService.createSession(session);
    }

    // Other endpoints for updating, deleting, and retrieving sessions
}
