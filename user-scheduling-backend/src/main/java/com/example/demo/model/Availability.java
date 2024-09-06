package com.example.demo.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "availabilities")
public class Availability {
    @Id
    private String id;
    private String userId;
    private LocalDateTime start;
    private LocalDateTime end;
    private int duration; // Duration in minutes

    // Constructors
    public Availability() {}

    public Availability(String id, String userId, LocalDateTime start, LocalDateTime end, int duration) {
        this.id = id;
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.duration = duration;
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
}
