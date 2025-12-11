package com.mass_times.backend.application.port.in.parish;

import com.mass_times.backend.domain.model.parish.ParishBO;

public interface UpdateParishUseCase {

    ParishBO update(ParishBO parishBO);
}
