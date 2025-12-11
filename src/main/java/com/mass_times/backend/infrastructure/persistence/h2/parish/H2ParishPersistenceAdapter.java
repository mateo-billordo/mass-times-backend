package com.mass_times.backend.infrastructure.persistence.h2.parish;

import com.mass_times.backend.application.port.out.ParishPort;
import com.mass_times.backend.domain.model.parish.ParishBO;
import com.mass_times.backend.infrastructure.persistence.jpa.parish.ParishEntity;
import com.mass_times.backend.infrastructure.persistence.jpa.parish.ParishEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("inmemory")
@AllArgsConstructor
public class H2ParishPersistenceAdapter implements ParishPort {

    private H2ParishRepository repository;
    private ParishEntityMapper mapper;

    @Override
    public Optional<ParishBO> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toParishBO);
    }

    @Override
    public List<ParishBO> findAll() {
        return mapper.toParishBOList(repository.findAll());
    }

    @Override
    public ParishBO save(ParishBO parishBO) {
        return mapper.toParishBO(
                repository.save(
                        mapper.toParishEntity(parishBO)
                ));
    }

    @Override
    public ParishBO update(ParishBO parishBO) {
        ParishEntity entity = repository.findById(parishBO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Parish not found: " + parishBO.getId()));

        entity.setCityId(parishBO.getCityId());
        entity.setName(parishBO.getName());
        entity.setAddress(parishBO.getAddress());
        entity.setPhone(parishBO.getPhone());
        entity.setUrls(parishBO.getUrls());

        ParishEntity saved = repository.save(entity);
        return mapper.toParishBO(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
