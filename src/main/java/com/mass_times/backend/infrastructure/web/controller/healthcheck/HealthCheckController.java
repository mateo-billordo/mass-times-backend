package com.mass_times.backend.infrastructure.web.controller.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public interface HealthCheckController {

    @GetMapping("/healthcheck")
    public Map<String, Object> healthcheck();
}
