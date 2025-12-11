package com.mass_times.backend.infrastructure.persistence.jpa.parish;

import com.mass_times.backend.domain.model.parish.ParishBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParishEntityMapper {

    @Mapping(target = "id", ignore = true)
    ParishEntity toParishEntity(ParishBO parishBO);

    @Mapping(target = "id", ignore = true)
    List<ParishEntity> toParishEntityList(List<ParishBO> parishBOList);

    ParishBO toParishBO(ParishEntity parishEntity);

    List<ParishBO> toParishBOList(List<ParishEntity> parishEntityList);
}
