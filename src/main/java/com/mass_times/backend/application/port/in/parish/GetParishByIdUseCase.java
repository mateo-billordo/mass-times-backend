package com.mass_times.backend.application.port.in.parish;

import com.mass_times.backend.domain.model.ParishBO;

import java.util.Optional;

public interface GetParishByIdUseCase {

    Optional<ParishBO> getParishById(Long id);
}
