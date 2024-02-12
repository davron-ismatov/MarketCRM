package com.example.marketcrm.dto.returnDocItems;


import com.example.marketcrm.dto.returnDocument.ReturnDocWithoutItemsDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnDocItemsDTO {
    private Long id;
    private ReturnDocWithoutItemsDTO document;
    private StoreProductDTO product;
    private Double count;
}
