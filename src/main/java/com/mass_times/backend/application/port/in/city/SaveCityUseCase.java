package com.mass_times.backend.application.port.in.city;

import com.mass_times.backend.domain.model.city.CityBO;

public interface SaveCityUseCase {

    CityBO save(CityBO cityBO);
}
