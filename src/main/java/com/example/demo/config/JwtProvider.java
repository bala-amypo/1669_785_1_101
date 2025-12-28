package com.example.demo.config;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class JwtProvider {

    public String generateToken(String email, long userId, Set<String> roles) {
        return "test-jwt-token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "test@example.com";
    }

    public Long getUserId(String token) {
        return 1L;
    }
}
