package com.example.marketcrm.dto.arrivalDocItem;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocsWithOrgDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocItemDTO {
    private Long id;
    private Double arrival_price;
    private Double count;
    private ArrivalDocsWithOrgDTO document;
    private ProductWithCategoryDTO products;
}
