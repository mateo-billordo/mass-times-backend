package com.mass_times.backend.infrastructure.persistence.h2.mass;

import com.mass_times.backend.infrastructure.persistence.jpa.mass.MassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2MassRepository extends JpaRepository<MassEntity, Long> {
}
