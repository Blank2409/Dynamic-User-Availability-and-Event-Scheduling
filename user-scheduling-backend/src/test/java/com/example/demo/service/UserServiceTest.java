package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserByEmail() {
        User user = new User();
        user.setId("1");
        user.setEmail("user@example.com");
        
        when(userRepository.findByEmail("user@example.com")).thenReturn(user);
        
        User found = userService.getUserByEmail("user@example.com");
        
        assertNotNull(found);
    }

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setId("1");
        user.setEmail("user@example.com");
        
        when(userRepository.save(user)).thenReturn(user);
        
        User created = userService.createUser(user);
        
        assertNotNull(created);
    }
}
