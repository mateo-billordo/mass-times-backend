package com.mass_times.backend.infrastructure.web.dto;

import com.mass_times.backend.domain.model.event.EventType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventDTO {
    private Long id;
    private Long parishId;
    private String name;
    private String description;
    private EventType type;
    private LocalDateTime dateTime;
}
