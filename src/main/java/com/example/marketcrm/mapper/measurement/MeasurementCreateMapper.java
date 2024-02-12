package com.example.marketcrm.mapper.measurement;

import com.example.marketcrm.dto.measurement.MeasurementCreateDTO;
import com.example.marketcrm.entity.Measurement;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MeasurementCreateMapper extends EntityMapper<MeasurementCreateDTO, Measurement> {
    @Override
    @Mapping(ignore = true,target = "id")
    Measurement toEntity(MeasurementCreateDTO dto);
}
