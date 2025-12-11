package com.mass_times.backend.application.port.in.parish;

import com.mass_times.backend.domain.model.parish.ParishBO;

import java.util.List;

public interface ListParishesUseCase {

    List<ParishBO> listAllParishes();
}
