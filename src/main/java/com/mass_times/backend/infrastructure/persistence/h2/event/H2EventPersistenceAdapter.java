package com.mass_times.backend.infrastructure.persistence.h2.event;

import com.mass_times.backend.application.port.out.EventPort;
import com.mass_times.backend.domain.model.event.EventBO;
import com.mass_times.backend.infrastructure.persistence.jpa.event.EventEntityMapper;
import com.mass_times.backend.infrastructure.persistence.jpa.event.EventEntity;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("inmemory")
@AllArgsConstructor
public class H2EventPersistenceAdapter implements EventPort {
    
    private H2EventRepository repository;
    private EventEntityMapper mapper;

    @Override
    public Optional<EventBO> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toEventBO);
    }

    @Override
    public List<EventBO> findAll() {
        return mapper.toEventBOList(repository.findAll());
    }

    @Override
    public EventBO save(EventBO eventBO) {
        return mapper.toEventBO(
                repository.save(
                        mapper.toEventEntity(eventBO)
                ));
    }

    @Override
    public EventBO update(EventBO eventBO) {
        EventEntity entity = repository.findById(eventBO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Parish not found: " + eventBO.getId()));

        entity.setParishId(eventBO.getParishId());
        entity.setName(eventBO.getName());
        entity.setDescription(eventBO.getDescription());
        entity.setType(eventBO.getType());
        entity.setDateTime(eventBO.getDateTime());

        EventEntity saved = repository.save(entity);
        return mapper.toEventBO(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
