package com.mass_times.backend.application.port.in.parish;

import com.mass_times.backend.domain.model.ParishBO;

public interface SaveParishUseCase {

    ParishBO save(ParishBO parishBO);
}
