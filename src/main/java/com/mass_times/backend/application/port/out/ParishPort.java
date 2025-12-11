package com.mass_times.backend.application.port.out;

import com.mass_times.backend.domain.model.parish.ParishBO;

import java.util.List;
import java.util.Optional;

public interface ParishPort {

    Optional<ParishBO> findById(Long id);

    List<ParishBO> findAll();

    ParishBO save(ParishBO parishBO);

    ParishBO update(ParishBO parishBO);

    void deleteById(Long id);
}
