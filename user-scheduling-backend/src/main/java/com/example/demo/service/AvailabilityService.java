package com.example.demo.service;

import com.example.demo.model.Availability;
import com.example.demo.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailabilityService {
    @Autowired
    private AvailabilityRepository availabilityRepository;

    public Availability createAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    // Other methods for updating, deleting, and retrieving availability
}
