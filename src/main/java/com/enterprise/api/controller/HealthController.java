package com.enterprise.api/controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> getStatus() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "enterprise-java-api",
            "environment", System.getenv().getOrDefault("SPRING_PROFILES_ACTIVE", "default"),
            "timestamp", Instant.now().toString()
        ));
    }
}
