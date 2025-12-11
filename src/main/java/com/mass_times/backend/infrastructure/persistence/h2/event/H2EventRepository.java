package com.mass_times.backend.infrastructure.persistence.h2.event;

import com.mass_times.backend.infrastructure.persistence.jpa.event.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2EventRepository extends JpaRepository<EventEntity, Long> {
}
