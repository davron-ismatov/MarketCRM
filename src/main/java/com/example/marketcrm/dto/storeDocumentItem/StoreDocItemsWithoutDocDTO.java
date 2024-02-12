package com.example.marketcrm.dto.storeDocumentItem;

import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDocItemsWithoutDocDTO {
    private Long id;
    private StoreProductDTO product;
    private Double amount;
}
