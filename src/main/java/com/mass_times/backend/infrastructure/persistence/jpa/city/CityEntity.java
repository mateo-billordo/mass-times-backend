package com.mass_times.backend.infrastructure.persistence.jpa.city;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String province;
    private String country;
    private String timezone;

    public CityEntity(String name, String province, String country, String timezone) {
        this.name = name;
        this.province = province;
        this.country = country;
        this.timezone = timezone;
    }
}
