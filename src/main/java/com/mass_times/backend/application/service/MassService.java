package com.mass_times.backend.application.service;

import com.mass_times.backend.application.port.in.mass.DeleteMassByIdUseCase;
import com.mass_times.backend.application.port.in.mass.GetMassByIdUseCase;
import com.mass_times.backend.application.port.in.mass.ListMassesUseCase;
import com.mass_times.backend.application.port.in.mass.SaveMassUseCase;
import com.mass_times.backend.application.port.in.mass.UpdateMassUseCase;
import com.mass_times.backend.application.port.out.MassPort;
import com.mass_times.backend.domain.model.mass.MassBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MassService implements GetMassByIdUseCase, ListMassesUseCase,
        SaveMassUseCase, UpdateMassUseCase,
        DeleteMassByIdUseCase {

    private MassPort massPort;

    @Override
    public Optional<MassBO> getMassById(Long id) {
        return massPort.findById(id);
    }

    @Override
    public List<MassBO> listAllMasses() {
        return massPort.findAll();
    }

    @Override
    public MassBO save(MassBO massBO) {
        return massPort.save(massBO);
    }

    @Override
    public MassBO update(MassBO massBO) {
        return massPort.update(massBO);
    }

    @Override
    public void deleteById(Long id) {
        massPort.deleteById(id);
    }
}
