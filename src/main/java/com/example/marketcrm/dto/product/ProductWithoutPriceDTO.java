package com.example.marketcrm.dto.product;

import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.dto.measurement.MeasurementDTO;
import com.example.marketcrm.dto.productPrice.ProductPriceWithoutProductDTO;
import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductWithoutPriceDTO {
    private Long id;
    private String product_name;
    private CategoryDTO category;
    private MeasurementDTO unit;
    private Float amount;
}
