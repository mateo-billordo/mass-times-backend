package com.mass_times.backend.application.port.in.city;

import com.mass_times.backend.domain.model.city.CityBO;

import java.util.List;

public interface ListCitiesUseCase {

    List<CityBO> listAllCities();
}
