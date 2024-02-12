package com.example.marketcrm.dto.returnToWarehouseDocItems;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocWithoutItemsDTO;
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
public class ReturnToWarehouseDocItemsCreateDTO {
    private ReturnToWarehouseDocWithoutItemsDTO document;
    private StoreProductDTO storeProduct;
    private ProductWithCategoryDTO product;
    private Double count;
}
