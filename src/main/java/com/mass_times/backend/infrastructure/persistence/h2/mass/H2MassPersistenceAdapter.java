package com.mass_times.backend.infrastructure.persistence.h2.mass;

import com.mass_times.backend.application.port.out.MassPort;
import com.mass_times.backend.domain.model.mass.MassBO;
import com.mass_times.backend.infrastructure.persistence.jpa.mass.MassEntityMapper;
import com.mass_times.backend.infrastructure.persistence.jpa.mass.MassEntity;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("inmemory")
@AllArgsConstructor
public class H2MassPersistenceAdapter implements MassPort {
    
    private H2MassRepository repository;
    private MassEntityMapper mapper;

    @Override
    public Optional<MassBO> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toMassBO);
    }

    @Override
    public List<MassBO> findAll() {
        return mapper.toMassBOList(repository.findAll());
    }

    @Override
    public MassBO save(MassBO massBO) {
        return mapper.toMassBO(
                repository.save(
                        mapper.toMassEntity(massBO)
                ));
    }

    @Override
    public MassBO update(MassBO massBO) {
        MassEntity entity = repository.findById(massBO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Parish not found: " + massBO.getId()));

        entity.setParishId(massBO.getParishId());
        entity.setDayOfWeek(massBO.getDayOfWeek());
        entity.setTime(massBO.getTime());
        entity.setType(massBO.getType());

        MassEntity saved = repository.save(entity);
        return mapper.toMassBO(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
