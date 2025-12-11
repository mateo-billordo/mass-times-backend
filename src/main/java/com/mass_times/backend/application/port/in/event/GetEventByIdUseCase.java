package com.mass_times.backend.application.port.in.event;

import com.mass_times.backend.domain.model.event.EventBO;

import java.util.Optional;

public interface GetEventByIdUseCase {

    Optional<EventBO> getEventById(Long id);
}
