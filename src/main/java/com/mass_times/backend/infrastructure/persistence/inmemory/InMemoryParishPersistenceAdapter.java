package com.mass_times.backend.infrastructure.persistence.inmemory;

import com.mass_times.backend.application.port.out.ParishPort;
import com.mass_times.backend.domain.model.ParishBO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
@Profile("inmemory")
public class InMemoryParishPersistenceAdapter implements ParishPort {

    private final ConcurrentHashMap<Long, ParishBO> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    @Override
    public Optional<ParishBO> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<ParishBO> findAll() {
        return storage.values().stream().toList();
    }

    @Override
    public ParishBO save(ParishBO parishBO) {
        if (parishBO.getId() == null) {
            Long newId = sequence.getAndIncrement();
            parishBO.setId(newId);
        }
        storage.put(parishBO.getId(), parishBO);
        return parishBO;
    }

    @Override
    public ParishBO update(ParishBO parishBO) {
        ParishBO current = null;
        Optional<ParishBO> opt = Optional.ofNullable(storage.get(parishBO.getId()));
        if (opt.isPresent()) {
            current = opt.get();
            current.setCityId(parishBO.getCityId());
            current.setName(parishBO.getName());
            current.setAddress(parishBO.getAddress());
            current.setPhone(parishBO.getPhone());
            current.setUrls(parishBO.getUrls());
        }
        return current;
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            storage.remove(id);
        }
    }
}
