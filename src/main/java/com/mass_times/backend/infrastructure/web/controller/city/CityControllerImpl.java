package com.mass_times.backend.infrastructure.web.controller.city;

import com.mass_times.backend.application.port.in.city.DeleteCityByIdUseCase;
import com.mass_times.backend.application.port.in.city.GetCityByIdUseCase;
import com.mass_times.backend.application.port.in.city.ListCitiesUseCase;
import com.mass_times.backend.application.port.in.city.SaveCityUseCase;
import com.mass_times.backend.application.port.in.city.UpdateCityUseCase;
import com.mass_times.backend.infrastructure.web.dto.CityDTO;
import com.mass_times.backend.infrastructure.web.mapper.CityMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CityControllerImpl implements CityController{
    
    /** MAPPER */
    private CityMapper cityMapper;
    
    /** USE CASES */
    private GetCityByIdUseCase getCityByIdUseCase;
    private ListCitiesUseCase listCitiesUseCase;
    private SaveCityUseCase saveCityUseCase;
    private UpdateCityUseCase updateCityUseCase;
    private DeleteCityByIdUseCase deleteCityByIdUseCase;

    @Override
    public CityDTO getCityById(Long cityId) {
        return getCityByIdUseCase.getCityById(cityId)
                .map(cityMapper::toCityDTO)
                .orElse(null);

    }

    @Override
    public List<CityDTO> getAllCities() {
        return cityMapper.toCityDTOList(
                listCitiesUseCase.listAllCities());
    }

    @Override
    public CityDTO saveCity(CityDTO cityDTO) {
        return cityMapper.toCityDTO(
                saveCityUseCase.save(
                        cityMapper.toCityBO(cityDTO)
                ));
    }

    @Override
    public CityDTO updateCity(CityDTO cityDTO) {
        return cityMapper.toCityDTO(
                updateCityUseCase.update(
                        cityMapper.toCityBO(cityDTO)
                ));
    }

    @Override
    public void deleteCityById(Long cityId) {
        deleteCityByIdUseCase.deleteById(cityId);
    }
}
