package com.example.marketcrm.mapper.measurement;

import com.example.marketcrm.dto.measurement.MeasurementDTO;
import com.example.marketcrm.entity.Measurement;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeasurementMapper  extends EntityMapper<MeasurementDTO, Measurement> {
}
