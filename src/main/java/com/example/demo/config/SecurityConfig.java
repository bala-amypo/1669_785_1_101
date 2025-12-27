package com.example.demo.config;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth

                // 🔓 Auth & Swagger
                .requestMatchers(
                    "/auth/**",
                    "/swagger-ui/**",
                    "/v3/api-docs/**"
                ).permitAll()

                // 🔓 Products
                .requestMatchers(HttpMethod.POST, "/products").permitAll()
                .requestMatchers(HttpMethod.GET, "/products").permitAll()

                // 🔓 Warranties
                .requestMatchers(HttpMethod.POST, "/warranties/register/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/warranties/**").permitAll()

                // 🔓 Alert Logs
                .requestMatchers(HttpMethod.POST, "/logs/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/logs/**").permitAll()

                // 🔓 Alert Schedules
                .requestMatchers(HttpMethod.POST, "/schedules/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/schedules/**").permitAll()

                // 🔒 Everything else
                .anyRequest().authenticated()
            )

            .exceptionHandling(ex ->
                ex.authenticationEntryPoint(new JwtAuthenticationEntryPoint())
            )

            .addFilterBefore(
                jwtAuthenticationFilter,
                UsernamePasswordAuthenticationFilter.class
            );

        return http.build();
    }
}
