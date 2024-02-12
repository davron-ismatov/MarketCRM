package com.example.marketcrm.dto.productPrice;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Product;
import jakarta.persistence.Column;
import lombok.*;

import java.sql.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceCreateDTO {
    private ProductWithCategoryDTO product;
    private Double price;
    private Boolean is_actual;
}
