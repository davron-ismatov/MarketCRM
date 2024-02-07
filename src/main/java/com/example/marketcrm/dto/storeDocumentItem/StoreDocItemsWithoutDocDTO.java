package com.example.marketcrm.dto.storeDocumentItem;

import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.StoreDocument;
import com.example.marketcrm.entity.StoreProduct;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDocItemsWithoutDoc {
    private Long id;
    private StoreProductDTO product;
    private Double amount;
}
