package com.example.marketcrm.dto.storeDocumentItem;

import com.example.marketcrm.dto.storeDocument.StoreDocWithoutItemsDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.StoreDocument;
import com.example.marketcrm.entity.StoreProduct;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDocItemsCreateDTO {
    private StoreDocWithoutItemsDTO document;
    private StoreProductDTO product;
    private Double amount;
}
