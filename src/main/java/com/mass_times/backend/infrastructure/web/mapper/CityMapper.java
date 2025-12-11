package com.mass_times.backend.infrastructure.web.mapper;

import com.mass_times.backend.domain.model.city.CityBO;
import com.mass_times.backend.infrastructure.web.dto.city.CityDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityBO toCityBO(CityDTO parishDTO);

    List<CityBO> toCityBOList(List<CityDTO> parishDTOList);

    CityDTO toCityDTO(CityBO cityBO);

    List<CityDTO> toCityDTOList(List<CityBO> cityBOList);
}
