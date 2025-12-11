package com.mass_times.backend.application.port.out;

import com.mass_times.backend.domain.model.event.EventBO;

import java.util.List;
import java.util.Optional;

public interface EventPort {

    Optional<EventBO> findById(Long id);

    List<EventBO> findAll();

    EventBO save(EventBO massBO);

    EventBO update(EventBO massBO);

    void deleteById(Long id);
}
