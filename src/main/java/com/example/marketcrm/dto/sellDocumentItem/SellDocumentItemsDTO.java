package com.example.marketcrm.dto.sellDocumentItem;

import com.example.marketcrm.dto.sellDocument.SellDocumentWithoutItemsDTO;
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
public class SellDocumentItemsDTO {
    private Long id;
    private SellDocumentWithoutItemsDTO document;
    private StoreProductDTO product;
    private Double count;
    private Double price;
}
