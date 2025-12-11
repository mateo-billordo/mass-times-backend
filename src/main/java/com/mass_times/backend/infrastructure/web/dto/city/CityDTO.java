package com.mass_times.backend.infrastructure.web.dto.city;

import lombok.Data;

@Data
public class CityDTO {
    private Long id;
    private String name;
    private String province;
    private String country;
    private String timezone;
}
