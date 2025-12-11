package com.mass_times.backend.application.service;

import com.mass_times.backend.application.port.in.city.DeleteCityByIdUseCase;
import com.mass_times.backend.application.port.in.city.GetCityByIdUseCase;
import com.mass_times.backend.application.port.in.city.ListCitiesUseCase;
import com.mass_times.backend.application.port.in.city.SaveCityUseCase;
import com.mass_times.backend.application.port.in.city.UpdateCityUseCase;
import com.mass_times.backend.application.port.out.CityPort;
import com.mass_times.backend.domain.model.city.CityBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService implements GetCityByIdUseCase, ListCitiesUseCase,
        SaveCityUseCase, UpdateCityUseCase,
        DeleteCityByIdUseCase {
    
    private CityPort cityPort;

    @Override
    public Optional<CityBO> getCityById(Long id) {
        return cityPort.findById(id);
    }

    @Override
    public List<CityBO> listAllCities() {
        return cityPort.findAll();
    }

    @Override
    public CityBO save(CityBO cityBO) {
        return cityPort.save(cityBO);
    }

    @Override
    public CityBO update(CityBO cityBO) {
        return cityPort.update(cityBO);
    }

    @Override
    public void deleteById(Long id) {
        cityPort.deleteById(id);
    }
}
