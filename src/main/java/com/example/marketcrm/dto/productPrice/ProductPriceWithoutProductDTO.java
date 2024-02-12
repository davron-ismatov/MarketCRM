package com.example.marketcrm.dto.productPrice;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import lombok.*;

import java.sql.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPriceWithoutProductDTO {

    private Long id;
    private Double price;
    private Date date;
    private Boolean is_actual;
}
