package com.mass_times.backend.infrastructure.web.controller.parish;

import com.mass_times.backend.application.port.in.parish.DeleteParishByIdUseCase;
import com.mass_times.backend.application.port.in.parish.GetParishByIdUseCase;
import com.mass_times.backend.application.port.in.parish.ListParishesUseCase;
import com.mass_times.backend.application.port.in.parish.SaveParishUseCase;
import com.mass_times.backend.application.port.in.parish.UpdateParishUseCase;
import com.mass_times.backend.infrastructure.web.dto.ParishDTO;
import com.mass_times.backend.infrastructure.web.mapper.ParishMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ParishControllerImpl implements ParishController {

    /** MAPPER */
    private ParishMapper parishMapper;

    /** USE CASES */
    private GetParishByIdUseCase getParishByIdUseCase;
    private ListParishesUseCase listParishesUseCase;
    private SaveParishUseCase saveParishUseCase;
    private UpdateParishUseCase updateParishUseCase;
    private DeleteParishByIdUseCase deleteParishByIdUseCase;

    @Override
    public ParishDTO getParishById(Long parishId) {
        return getParishByIdUseCase.getParishById(parishId)
                .map(parishMapper::toParishDTO)
                .orElse(null);

    }

    @Override
    public List<ParishDTO> getAllParishes() {
        return parishMapper.toParishDTOList(
                listParishesUseCase.listAllParishes());
    }

    @Override
    public ParishDTO saveParish(ParishDTO parishDTO) {
        return parishMapper.toParishDTO(
                saveParishUseCase.save(
                        parishMapper.toParishBO(parishDTO)
                ));
    }

    @Override
    public ParishDTO updateParish(ParishDTO parishDTO) {
        return parishMapper.toParishDTO(
                updateParishUseCase.update(
                        parishMapper.toParishBO(parishDTO)
                ));
    }

    @Override
    public void deleteParishById(Long parishId) {
        deleteParishByIdUseCase.deleteById(parishId);
    }
}
