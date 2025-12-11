package com.mass_times.backend.application.port.in.event;

import com.mass_times.backend.domain.model.event.EventBO;

public interface UpdateEventUseCase {

    EventBO update(EventBO eventBO);
}
