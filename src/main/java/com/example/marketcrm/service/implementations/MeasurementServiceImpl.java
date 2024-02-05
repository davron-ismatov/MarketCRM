package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.measurement.MeasurementCreateDTO;
import com.example.marketcrm.dto.measurement.MeasurementDTO;
import com.example.marketcrm.entity.Measurement;
import com.example.marketcrm.mapper.measurement.MeasurementCreateMapper;
import com.example.marketcrm.mapper.measurement.MeasurementMapper;
import com.example.marketcrm.repository.MeasurementRepository;
import com.example.marketcrm.service.MeasurementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MeasurementServiceImpl implements MeasurementService {

    private final MeasurementRepository repository;
    private final MeasurementMapper mapper;
    private final MeasurementCreateMapper createMapper;

    @Override
    public Set<MeasurementDTO> getAllMeasurements() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public MeasurementDTO getMeasurement(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public MeasurementDTO createMeasurement(MeasurementCreateDTO createDTO) {
        return mapper.toDTO(
                repository.save(
                createMapper.toEntity(createDTO)
        ));
    }

    @Override
    public MeasurementDTO updateMeasurement(MeasurementCreateDTO createDTO, Long id) {
        Measurement measurement = repository.getReferenceById(id);
        measurement.setUnit_name(createDTO.getUnit_name());

        return mapper.toDTO(
                repository.save(measurement)
        );
    }

    @Override
    public void deleteMeasurement(Long id) {
        repository.deleteById(id);
    }
}
