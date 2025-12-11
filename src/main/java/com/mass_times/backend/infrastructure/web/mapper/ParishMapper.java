package com.mass_times.backend.infrastructure.web.mapper;

import com.mass_times.backend.domain.model.parish.ParishBO;
import com.mass_times.backend.infrastructure.web.dto.ParishDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParishMapper {

    ParishBO toParishBO(ParishDTO parishDTO);

    List<ParishBO> toParishBOList(List<ParishDTO> parishDTOList);

    ParishDTO toParishDTO(ParishBO parishBO);

    List<ParishDTO> toParishDTOList(List<ParishBO> parishBOList);
}
