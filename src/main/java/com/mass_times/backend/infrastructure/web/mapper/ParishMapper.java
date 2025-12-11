package com.mass_times.backend.infrastructure.web.mapper;

import com.mass_times.backend.domain.model.ParishBO;
import com.mass_times.backend.infrastructure.web.dto.parish.ParishDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParishMapper {

    ParishBO toParishBO(ParishDTO parishDTO);

    List<ParishBO> toParishBOList(List<ParishDTO> parishDTOList);

    ParishDTO toParishResponseDTO(ParishBO parishBO);

    List<ParishDTO> toParishResponseDTOList(List<ParishBO> parishBOList);
}
