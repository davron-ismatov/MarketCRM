package com.example.marketcrm.dto.sellDocumentItem;

import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.SellDocument;
import com.example.marketcrm.entity.StoreProduct;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellDocumentItemsWithoutDocsDTO {
    private Long id;
    private StoreProductDTO product;
    private Double count;
    private Double price;
}
