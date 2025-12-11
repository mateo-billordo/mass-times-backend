package com.mass_times.backend.domain.model;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
public class MassBO {
    private Long id;
    private Long parishId;
    private DayOfWeek dayOfWeek;
    private LocalTime time;
    private MassType type;
}
