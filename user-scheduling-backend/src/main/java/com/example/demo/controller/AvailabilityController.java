package com.example.demo.controller;

import com.example.demo.model.Availability;
import com.example.demo.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/availabilities")
public class AvailabilityController {
    @Autowired
    private AvailabilityService availabilityService;

    @PostMapping
    public Availability createAvailability(@RequestBody Availability availability) {
        return availabilityService.createAvailability(availability);
    }

    // Other endpoints for updating, deleting, and retrieving availability
}
