package com.mass_times.backend.domain.model.event;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventBO {
    private Long id;
    private Long parishId;
    private String name;
    private String description;
    private EventType type;
    private LocalDateTime dateTime;
}
