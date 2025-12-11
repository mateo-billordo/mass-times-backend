package com.mass_times.backend.infrastructure.persistence.jpa.parish;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "parish")
@Data
@NoArgsConstructor
public class ParishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private Long cityId;
    private String name;
    private String address;
    private String phone;

    @ElementCollection
    private List<String> urls;

    public ParishEntity(Long cityId, String name, String address, String phone, List<String> urls) {
        this.cityId = cityId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.urls = urls;
    }
}
