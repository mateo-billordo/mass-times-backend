package com.mass_times.backend.infrastructure.web.dto;

import com.mass_times.backend.domain.model.mass.MassType;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
public class MassDTO {
    private Long id;
    private Long parishId;
    private DayOfWeek dayOfWeek;
    private LocalTime time;
    private MassType type;
}
