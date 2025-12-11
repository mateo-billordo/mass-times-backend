package com.mass_times.backend.infrastructure.persistence.jpa.mass;

import com.mass_times.backend.domain.model.mass.MassType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "mass")
@Getter
@Setter
@NoArgsConstructor
public class MassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long parishId;
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
    private LocalTime time;
    @Enumerated(EnumType.STRING)
    private MassType type;

    public MassEntity(Long parishId, DayOfWeek dayOfWeek, LocalTime time, MassType type) {
        this.parishId = parishId;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.type = type;
    }
}
