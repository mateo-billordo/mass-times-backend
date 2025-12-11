package com.mass_times.backend.infrastructure.web.dto.event;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventDTO {
    private Long id;
    private Long parishId;
    private String name;
    private String description;
    private EventTypeDTO type;
    private LocalDateTime dateTime;
}
