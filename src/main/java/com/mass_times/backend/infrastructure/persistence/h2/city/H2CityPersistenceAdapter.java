package com.mass_times.backend.infrastructure.persistence.h2.city;

import com.mass_times.backend.application.port.out.CityPort;
import com.mass_times.backend.domain.model.city.CityBO;
import com.mass_times.backend.domain.model.city.CityBO;
import com.mass_times.backend.infrastructure.persistence.jpa.city.CityEntityMapper;
import com.mass_times.backend.infrastructure.persistence.jpa.city.CityEntity;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("inmemory")
@AllArgsConstructor
public class H2CityPersistenceAdapter implements CityPort {
    
    private H2CityRepository repository;
    private CityEntityMapper mapper;

    @Override
    public Optional<CityBO> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toCityBO);
    }

    @Override
    public List<CityBO> findAll() {
        return mapper.toCityBOList(repository.findAll());
    }

    @Override
    public CityBO save(CityBO parishBO) {
        return mapper.toCityBO(
                repository.save(
                        mapper.toCityEntity(parishBO)
                ));
    }

    @Override
    public CityBO update(CityBO parishBO) {
        CityEntity entity = repository.findById(parishBO.getId())
                .orElseThrow(() -> new IllegalArgumentException("City not found: " + parishBO.getId()));

        entity.setName(parishBO.getName());
        entity.setProvince(parishBO.getProvince());
        entity.setCountry(parishBO.getCountry());
        entity.setTimezone(parishBO.getTimezone());

        CityEntity saved = repository.save(entity);
        return mapper.toCityBO(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
