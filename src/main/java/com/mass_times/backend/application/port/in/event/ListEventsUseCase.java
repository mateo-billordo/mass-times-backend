package com.mass_times.backend.application.port.in.event;

import com.mass_times.backend.domain.model.event.EventBO;

import java.util.List;

public interface ListEventsUseCase {

    List<EventBO> listAllEvents();
}
