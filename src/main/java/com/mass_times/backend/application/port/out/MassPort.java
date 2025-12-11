package com.mass_times.backend.application.port.out;

import com.mass_times.backend.domain.model.mass.MassBO;

import java.util.List;
import java.util.Optional;

public interface MassPort {

    Optional<MassBO> findById(Long id);

    List<MassBO> findAll();

    MassBO save(MassBO massBO);

    MassBO update(MassBO massBO);

    void deleteById(Long id);
}
