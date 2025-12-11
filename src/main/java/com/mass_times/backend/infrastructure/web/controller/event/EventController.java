package com.mass_times.backend.infrastructure.web.controller.event;

import com.mass_times.backend.infrastructure.web.dto.event.EventDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/event")
public interface EventController {

    @GetMapping("/{id}")
    EventDTO getEventById(@PathVariable("id") Long eventId);

    @GetMapping("/all")
    List<EventDTO> getAllEventes();

    @PostMapping
    EventDTO saveEvent(@RequestBody EventDTO eventDTO);

    @PutMapping
    EventDTO updateEvent(@RequestBody EventDTO eventDTO);

    @DeleteMapping("/{id}")
    void deleteEventById(@PathVariable("id") Long eventId);
}
