package com.mass_times.backend.infrastructure.persistence.jpa.city;

import com.mass_times.backend.domain.model.city.CityBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityEntityMapper {

    @Mapping(target = "id", ignore = true)
    CityEntity toCityEntity(CityBO cityBO);

    @Mapping(target = "id", ignore = true)
    List<CityEntity> toCityEntityList(List<CityBO> cityBOList);

    CityBO toCityBO(CityEntity cityEntity);

    List<CityBO> toCityBOList(List<CityEntity> cityEntityList);
}
