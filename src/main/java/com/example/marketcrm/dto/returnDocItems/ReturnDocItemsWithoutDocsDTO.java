package com.example.marketcrm.dto.returnDocItems;


import com.example.marketcrm.dto.returnDocument.ReturnDocWithoutItemsDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.ReturnDocument;
import com.example.marketcrm.entity.StoreProduct;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnDocItemsWithoutDocsDTO {
    private Long id;
    private StoreProductDTO product;
    private Double count;
}
