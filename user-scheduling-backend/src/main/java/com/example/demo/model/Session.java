package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sessions")
public class Session {
    @Id
    private String id;
    private String userId;
    private LocalDateTime start;
    private LocalDateTime end;
    private int duration; // Duration in minutes
    private List<Participant> participants;

    // Inner class for participant details
    public static class Participant {
        private String name;
        private String email;

        // Constructors
        public Participant() {}

        public Participant(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    // Constructors
    public Session() {}

    public Session(String id, String userId, LocalDateTime start, LocalDateTime end, int duration, List<Participant> participants) {
        this.id = id;
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.participants = participants;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
