package com.mass_times.backend.infrastructure.persistence.h2.parish;

import com.mass_times.backend.infrastructure.persistence.jpa.parish.ParishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2ParishRepository extends JpaRepository<ParishEntity, Long> {
}
