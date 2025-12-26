package com.example.demo.service.impl;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.dto.UserRegisterDto;
import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(UserRegisterDto dto) {
        User user = User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
        return userRepository.save(user);
    }

    @PostMapping("/login")
public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
    boolean ok = authService.authenticate(request.getEmail(), request.getPassword());
    if (!ok) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }mvn -Dtest=InventoryApplicationTests#t52_loginInvalid test
    String token = authService.generateToken(...);
    return ResponseEntity.ok(new AuthResponse(token));
}


    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(()->new ResourceNotFoundException("User not found"));
    }
}
