package com.mass_times.backend.infrastructure.web.mapper;

import com.mass_times.backend.domain.model.event.EventBO;
import com.mass_times.backend.infrastructure.web.dto.event.EventDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventBO toEventBO(EventDTO eventDTO);

    List<EventBO> toEventBOList(List<EventDTO> eventDTOList);

    EventDTO toEventDTO(EventBO EventBO);

    List<EventDTO> toEventDTOList(List<EventBO> EventBOList);
}
