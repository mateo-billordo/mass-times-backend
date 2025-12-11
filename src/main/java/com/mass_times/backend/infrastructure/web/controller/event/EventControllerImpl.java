package com.mass_times.backend.infrastructure.web.controller.event;

import com.mass_times.backend.application.port.in.event.DeleteEventByIdUseCase;
import com.mass_times.backend.application.port.in.event.GetEventByIdUseCase;
import com.mass_times.backend.application.port.in.event.ListEventsUseCase;
import com.mass_times.backend.application.port.in.event.SaveEventUseCase;
import com.mass_times.backend.application.port.in.event.UpdateEventUseCase;
import com.mass_times.backend.infrastructure.web.dto.EventDTO;
import com.mass_times.backend.infrastructure.web.mapper.EventMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EventControllerImpl implements EventController{

    /** MAPPER */
    private EventMapper eventMapper;
    /** USE CASES */
    private GetEventByIdUseCase getEventByIdUseCase;
    private ListEventsUseCase listEventsUseCase;
    private SaveEventUseCase saveEventUseCase;
    private UpdateEventUseCase updateEventUseCase;
    private DeleteEventByIdUseCase deleteEventByIdUseCase;

    @Override
    public EventDTO getEventById(Long eventId) {
        return getEventByIdUseCase.getEventById(eventId)
                .map(eventMapper::toEventDTO)
                .orElse(null);
    }

    @Override
    public List<EventDTO> getAllEventes() {
        return eventMapper.toEventDTOList(
                listEventsUseCase.listAllEvents());
    }

    @Override
    public EventDTO saveEvent(EventDTO eventDTO) {
        return eventMapper.toEventDTO(
                saveEventUseCase.save(
                        eventMapper.toEventBO(eventDTO)
                ));
    }

    @Override
    public EventDTO updateEvent(EventDTO eventDTO) {
        return eventMapper.toEventDTO(
                updateEventUseCase.update(
                        eventMapper.toEventBO(eventDTO)
                ));
    }

    @Override
    public void deleteEventById(Long eventId) {
        deleteEventByIdUseCase.deleteById(eventId);
    }
}
