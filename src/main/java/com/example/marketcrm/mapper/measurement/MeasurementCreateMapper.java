package com.example.marketcrm.mapper.measurement;

import com.example.marketcrm.dto.measurement.MeasurementCreateDTO;
import com.example.marketcrm.entity.Measurement;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementCreateMapper extends EntityMapper<MeasurementCreateDTO, Measurement> {
}
