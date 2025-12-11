package com.mass_times.backend.application.port.in.mass;

import com.mass_times.backend.domain.model.mass.MassBO;

import java.util.Optional;

public interface GetMassByIdUseCase {

    Optional<MassBO> getMassById(Long id);
}
