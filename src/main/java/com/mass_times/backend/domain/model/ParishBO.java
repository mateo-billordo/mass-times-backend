package com.mass_times.backend.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class ParishBO {
    private Long id;
    private Long cityId;
    private String name;
    private String address;
    private String phone;
    private List<String> urls;
}
