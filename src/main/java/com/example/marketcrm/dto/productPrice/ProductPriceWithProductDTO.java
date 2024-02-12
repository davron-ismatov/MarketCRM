package com.example.marketcrm.dto.productPrice;

import com.example.marketcrm.dto.product.ProductWithoutPriceDTO;
import lombok.*;

import java.sql.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceWithProductDTO {
    private Long id;
    private ProductWithoutPriceDTO product;
    private Double price;
    private Date date;
    private Boolean is_actual;
}
