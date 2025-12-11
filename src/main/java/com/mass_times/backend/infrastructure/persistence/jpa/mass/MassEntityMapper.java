package com.mass_times.backend.infrastructure.persistence.jpa.mass;

import com.mass_times.backend.domain.model.mass.MassBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MassEntityMapper {

    @Mapping(target = "id", ignore = true)
    MassEntity toMassEntity(MassBO massBO);

    @Mapping(target = "id", ignore = true)
    List<MassEntity> toMassEntityList(List<MassBO> massBOList);

    MassBO toMassBO(MassEntity massEntity);

    List<MassBO> toMassBOList(List<MassEntity> massEntityList);
}
