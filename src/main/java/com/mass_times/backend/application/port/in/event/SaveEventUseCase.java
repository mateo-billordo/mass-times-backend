package com.mass_times.backend.application.port.in.event;

import com.mass_times.backend.domain.model.event.EventBO;

public interface SaveEventUseCase {

    EventBO save(EventBO eventBO);
}
