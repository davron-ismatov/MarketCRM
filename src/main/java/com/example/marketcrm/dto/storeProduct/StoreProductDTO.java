package com.example.marketcrm.dto.storeProduct;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.entity.StoreDocumentItems;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreProductDTO {
    private Long id;
    private ProductWithCategoryDTO product;
    private Double amount;
}
