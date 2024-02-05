package com.example.marketcrm.dto.productPrice;

import com.example.marketcrm.dto.product.ProductWithoutPriceDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceWithProductDTO {
    private ProductWithoutPriceDTO product;
    private Double price;
    private Date date;
    private Boolean is_actual;
}
