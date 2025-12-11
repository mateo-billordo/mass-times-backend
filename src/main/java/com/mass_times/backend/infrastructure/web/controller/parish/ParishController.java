package com.mass_times.backend.infrastructure.web.controller.parish;

import com.mass_times.backend.infrastructure.web.dto.parish.ParishDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/parish")
public interface ParishController {

    @GetMapping("/{id}")
    ParishDTO getParishById(@PathVariable("id") Long parishId);

    @GetMapping("/all")
    List<ParishDTO> getAllParishes();

    @PostMapping
    ParishDTO saveParish(@RequestBody ParishDTO parishDTO);

    @PutMapping
    ParishDTO updateParish(@RequestBody ParishDTO parishDTO);

    @DeleteMapping("/{id}")
    void deleteParishById(@PathVariable("id") Long parishId);
}
