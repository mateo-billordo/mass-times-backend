package com.mass_times.backend.infrastructure.persistence.jpa.event;

import com.mass_times.backend.domain.model.event.EventBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventEntityMapper {

    @Mapping(target = "id", ignore = true)
    EventEntity toEventEntity(EventBO eventBO);

    @Mapping(target = "id", ignore = true)
    List<EventEntity> toEventEntityList(List<EventBO> eventBOList);

    EventBO toEventBO(EventEntity eventEntity);

    List<EventBO> toEventBOList(List<EventEntity> eventEntityList);
}
