package com.mass_times.backend.application.port.out;

import com.mass_times.backend.domain.model.city.CityBO;

import java.util.List;
import java.util.Optional;

public interface CityPort {

    Optional<CityBO> findById(Long id);

    List<CityBO> findAll();

    CityBO save(CityBO cityBO);

    CityBO update(CityBO cityBO);

    void deleteById(Long id);
}
