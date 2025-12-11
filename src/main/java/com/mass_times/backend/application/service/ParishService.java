package com.mass_times.backend.application.service;

import com.mass_times.backend.application.port.in.parish.DeleteParishByIdUseCase;
import com.mass_times.backend.application.port.in.parish.GetParishByIdUseCase;
import com.mass_times.backend.application.port.in.parish.ListParishesUseCase;
import com.mass_times.backend.application.port.in.parish.SaveParishUseCase;
import com.mass_times.backend.application.port.in.parish.UpdateParishUseCase;
import com.mass_times.backend.application.port.out.ParishPort;
import com.mass_times.backend.domain.model.ParishBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ParishService implements GetParishByIdUseCase, ListParishesUseCase,
        SaveParishUseCase, UpdateParishUseCase,
        DeleteParishByIdUseCase {

    private ParishPort parishPort;

    @Override
    public Optional<ParishBO> getParishById(Long id) {
        return parishPort.findById(id);
    }

    @Override
    public List<ParishBO> listAllParishes() {
        return parishPort.findAll();
    }

    @Override
    public ParishBO save(ParishBO parishBO) {
        return parishPort.save(parishBO);
    }

    @Override
    public ParishBO updateParish(ParishBO parishBO) {
        return parishPort.update(parishBO);
    }

    @Override
    public void deleteById(Long id) {
        parishPort.deleteById(id);
    }
}
