package com.example.marketcrm.service;


import com.example.marketcrm.dto.measurement.MeasurementCreateDTO;
import com.example.marketcrm.dto.measurement.MeasurementDTO;

import java.util.Set;

public interface MeasurementService {
    Set<MeasurementDTO> getAllMeasurements();
    MeasurementDTO getMeasurement(Long id);

    MeasurementDTO createMeasurement(MeasurementCreateDTO createDTO);

    MeasurementDTO updateMeasurement(MeasurementCreateDTO createDTO, Long id);
    void  deleteMeasurement(Long id);
}