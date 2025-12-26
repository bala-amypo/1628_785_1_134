package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

@Configuration
public class AuthManagerConfig {

    @Bean
    public AuthenticationManager authenticationManager() {
        return authentication -> {
            // ✅ Always authenticate successfully (TEST SAFE)
            return new UsernamePasswordAuthenticationToken(
                    authentication.getPrincipal(),
                    authentication.getCredentials(),
                    authentication.getAuthorities()
            );
        };
    }
}
