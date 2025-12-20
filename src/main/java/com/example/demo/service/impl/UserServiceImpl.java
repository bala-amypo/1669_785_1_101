// package com.example.demo.service.impl;

// import java.time.LocalDate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.entity.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// import com.example.demo.exception.ResourceNotFoundException;

// import com.example.demo.dto.UserRegisterDto;
// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.AuthResponse;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public User register(UserRegisterDto dto) {
//         User user = User.builder()
//                 .email(dto.getEmail())
//                 .password(dto.getPassword())
//                 .build();
//         return userRepository.save(user);
//     }

//     @Override
//     public AuthResponse login(AuthRequest request) {
//         return new AuthResponse("dummy-jwt-token");
//     }

//     @Override
//     public User getByEmail(String email) {
//         return userRepository.findByEmail(email)
//                 .orElseThrow(() -> new ResourceNotFoundException("User not found"));
//     }
// }
