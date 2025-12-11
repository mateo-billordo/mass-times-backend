package com.mass_times.backend.application.service;

import com.mass_times.backend.application.port.in.event.DeleteEventByIdUseCase;
import com.mass_times.backend.application.port.in.event.GetEventByIdUseCase;
import com.mass_times.backend.application.port.in.event.ListEventsUseCase;
import com.mass_times.backend.application.port.in.event.SaveEventUseCase;
import com.mass_times.backend.application.port.in.event.UpdateEventUseCase;
import com.mass_times.backend.application.port.out.EventPort;
import com.mass_times.backend.domain.model.event.EventBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EventService implements GetEventByIdUseCase, ListEventsUseCase,
        SaveEventUseCase, UpdateEventUseCase,
        DeleteEventByIdUseCase {

    private EventPort eventPort;

    @Override
    public Optional<EventBO> getEventById(Long id) {
        return eventPort.findById(id);
    }

    @Override
    public List<EventBO> listAllEvents() {
        return eventPort.findAll();
    }

    @Override
    public EventBO save(EventBO massBO) {
        return eventPort.save(massBO);
    }

    @Override
    public EventBO update(EventBO massBO) {
        return eventPort.update(massBO);
    }

    @Override
    public void deleteById(Long id) {
        eventPort.deleteById(id);
    }
}