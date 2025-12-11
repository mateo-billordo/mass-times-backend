package com.mass_times.backend.infrastructure.web.controller.healthcheck;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class HealthCheckControllerImpl implements HealthCheckController{

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> healthcheck() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return Map.of(
                    "status", "UP",
                    "database", "reachable"
            );
        } catch (Exception e) {
            return Map.of(
                    "status", "DOWN",
                    "error", e.getMessage()
            );
        }
    }
}
