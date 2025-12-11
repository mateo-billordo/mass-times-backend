package com.mass_times.backend.infrastructure.web.dto.parish;

import lombok.Data;

import java.util.List;

@Data
public class ParishDTO {
    private Long id;
    private Long cityId;
    private String name;
    private String address;
    private String phone;
    private List<String> urls;
}
