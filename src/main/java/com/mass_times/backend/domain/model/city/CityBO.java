package com.mass_times.backend.domain.model.city;

import lombok.Data;

@Data
public class CityBO {
    private Long id;
    private String name;
    private String province;
    private String country;
    private String timezone;
}
