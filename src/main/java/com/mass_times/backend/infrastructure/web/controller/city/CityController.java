package com.mass_times.backend.infrastructure.web.controller.city;

import com.mass_times.backend.infrastructure.web.dto.CityDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/city")
public interface CityController {

    @GetMapping("/{id}")
    CityDTO getCityById(@PathVariable("id") Long cityId);

    @GetMapping("/all")
    List<CityDTO> getAllCities();

    @PostMapping
    CityDTO saveCity(@RequestBody CityDTO cityDTO);

    @PutMapping
    CityDTO updateCity(@RequestBody CityDTO cityDTO);

    @DeleteMapping("/{id}")
    void deleteCityById(@PathVariable("id") Long cityId);
}
