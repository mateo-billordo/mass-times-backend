package com.mass_times.backend.infrastructure.web.controller.mass;

import com.mass_times.backend.application.port.in.mass.DeleteMassByIdUseCase;
import com.mass_times.backend.application.port.in.mass.GetMassByIdUseCase;
import com.mass_times.backend.application.port.in.mass.ListMassesUseCase;
import com.mass_times.backend.application.port.in.mass.SaveMassUseCase;
import com.mass_times.backend.application.port.in.mass.UpdateMassUseCase;
import com.mass_times.backend.infrastructure.web.dto.mass.MassDTO;
import com.mass_times.backend.infrastructure.web.mapper.MassMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MassControllerImpl implements MassController{
    
    /** MAPPER */
    private MassMapper massMapper;
    
    /** USE CASES */
    private GetMassByIdUseCase getMassByIdUseCase;
    private ListMassesUseCase listMassesUseCase;
    private SaveMassUseCase saveMassUseCase;
    private UpdateMassUseCase updateMassUseCase;
    private DeleteMassByIdUseCase deleteMassByIdUseCase;

    @Override
    public MassDTO getMassById(Long massId) {
        return getMassByIdUseCase.getMassById(massId)
                .map(massMapper::toMassDTO)
                .orElse(null);

    }

    @Override
    public List<MassDTO> getAllMasses() {
        return massMapper.toMassDTOList(
                listMassesUseCase.listAllMasses());
    }

    @Override
    public MassDTO saveMass(MassDTO massDTO) {
        return massMapper.toMassDTO(
                saveMassUseCase.save(
                        massMapper.toMassBO(massDTO)
                ));
    }

    @Override
    public MassDTO updateMass(MassDTO massDTO) {
        return massMapper.toMassDTO(
                updateMassUseCase.update(
                        massMapper.toMassBO(massDTO)
                ));
    }

    @Override
    public void deleteMassById(Long massId) {
        deleteMassByIdUseCase.deleteById(massId);
    }
}
