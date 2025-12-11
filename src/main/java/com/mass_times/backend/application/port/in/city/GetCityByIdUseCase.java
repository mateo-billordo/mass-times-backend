package com.mass_times.backend.application.port.in.city;

import com.mass_times.backend.domain.model.city.CityBO;

import java.util.Optional;

public interface GetCityByIdUseCase {

    Optional<CityBO> getCityById(Long id);
}
