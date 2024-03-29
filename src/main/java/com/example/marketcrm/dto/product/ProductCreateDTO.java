package com.example.marketcrm.dto.product;


import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.dto.measurement.MeasurementDTO;
import com.example.marketcrm.entity.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDTO {
    private String product_name;
    private CategoryDTO category;
    private MeasurementDTO unit;
    private Float amount;
}
