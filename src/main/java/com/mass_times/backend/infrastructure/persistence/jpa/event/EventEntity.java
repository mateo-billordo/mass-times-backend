package com.mass_times.backend.infrastructure.persistence.jpa.event;

import com.mass_times.backend.domain.model.event.EventType;
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

import java.time.LocalDateTime;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long parishId;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private LocalDateTime dateTime;

    public EventEntity(Long parishId, String name, String description, EventType type, LocalDateTime dateTime) {
        this.parishId = parishId;
        this.name = name;
        this.description = description;
        this.type = type;
        this.dateTime = dateTime;
    }
}
