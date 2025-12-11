package com.mass_times.backend.infrastructure.web.mapper;

import com.mass_times.backend.domain.model.mass.MassBO;
import com.mass_times.backend.infrastructure.web.dto.mass.MassDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MassMapper {

    MassBO toMassBO(MassDTO massDTO);

    List<MassBO> toMassBOList(List<MassDTO> massDTOList);

    MassDTO toMassDTO(MassBO MassBO);

    List<MassDTO> toMassDTOList(List<MassBO> MassBOList);
}
