package com.mass_times.backend.application.port.in.mass;

import com.mass_times.backend.domain.model.mass.MassBO;

import java.util.List;

public interface ListMassesUseCase {

    List<MassBO> listAllMasses();
}
