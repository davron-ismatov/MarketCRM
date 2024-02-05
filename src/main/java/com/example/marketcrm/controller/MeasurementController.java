package com.example.marketcrm.controller;

import com.example.marketcrm.dto.measurement.MeasurementCreateDTO;
import com.example.marketcrm.dto.measurement.MeasurementDTO;
import com.example.marketcrm.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/measurement")
public class MeasurementController  {
    @Autowired
    private MeasurementService service;


    @GetMapping
    public Set<MeasurementDTO> getAllMeasurements() {
        return service.getAllMeasurements();
    }

    @GetMapping("/{id}")
    public MeasurementDTO getMeasurement(@PathVariable Long id) {
        return service.getMeasurement(id);
    }

    @PostMapping
    public MeasurementDTO createMeasurement(@RequestBody MeasurementCreateDTO createDTO) {
        return service.createMeasurement(createDTO);
    }

    @PutMapping("/{id}")
    public MeasurementDTO updateMeasurement(@RequestBody MeasurementCreateDTO createDTO,@PathVariable Long id) {
        return service.updateMeasurement(createDTO,id);
    }

    @DeleteMapping("/{id}")
    public void deleteMeasurement(@PathVariable Long id) {
        service.deleteMeasurement(id);
    }
}
