package com.example.marketcrm.dto.measurement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementDTO {
    private Long id;
    private String unit_name;
}
