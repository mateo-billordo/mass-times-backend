package com.mass_times.backend.application.port.in.mass;

import com.mass_times.backend.domain.model.mass.MassBO;

public interface UpdateMassUseCase {

    MassBO update(MassBO massBO);
}
