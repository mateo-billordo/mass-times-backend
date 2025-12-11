package com.mass_times.backend.infrastructure.web.controller.mass;

import com.mass_times.backend.infrastructure.web.dto.MassDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/mass")
public interface MassController {

    @GetMapping("/{id}")
    MassDTO getMassById(@PathVariable("id") Long massId);

    @GetMapping("/all")
    List<MassDTO> getAllMasses();

    @PostMapping
    MassDTO saveMass(@RequestBody MassDTO massDTO);

    @PutMapping
    MassDTO updateMass(@RequestBody MassDTO massDTO);

    @DeleteMapping("/{id}")
    void deleteMassById(@PathVariable("id") Long massId);
}
