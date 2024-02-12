package com.example.marketcrm.dto.returnToWarehouseDocItems;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import com.example.marketcrm.entity.StoreProduct;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnToWarehouseDocItemsWithoutDocsDTO {
    private Long id;
    private StoreProductDTO storeProduct;
    private ProductWithCategoryDTO product;
    private Double count;
}
