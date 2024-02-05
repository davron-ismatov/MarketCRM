package com.example.marketcrm.dto.productPrice;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Product;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceCreateDTO {
    private ProductWithCategoryDTO product;
    private Double price;
    private Boolean is_actual;
}
