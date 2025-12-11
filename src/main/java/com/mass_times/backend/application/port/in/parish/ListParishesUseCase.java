package com.mass_times.backend.application.port.in.parish;

import com.mass_times.backend.domain.model.ParishBO;

import java.util.List;

public interface ListParishesUseCase {

    List<ParishBO> listAllParishes();
}
