package com.example.marketcrm.dto.arrivalDocItem;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocItemWithProductsDTO {
    private Long id;
    private Double arrival_price;
    private Double count;
    private ProductWithCategoryDTO products;
}
