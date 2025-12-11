package com.mass_times.backend.infrastructure.persistence.h2.city;

import com.mass_times.backend.infrastructure.persistence.jpa.city.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2CityRepository extends JpaRepository<CityEntity, Long> {
}
