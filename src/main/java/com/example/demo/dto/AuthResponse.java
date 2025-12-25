package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor   // 🔴 THIS FIXES THE ERROR
@NoArgsConstructor
public class AuthResponse {
    private String token;
}
