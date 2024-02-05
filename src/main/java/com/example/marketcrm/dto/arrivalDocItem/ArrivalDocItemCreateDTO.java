package com.example.marketcrm.dto.arrivalDocItem;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocItemCreateDTO {
    private Double arrival_price;
    private Double count;
    private ArrivalDocumentCreateDTO document;
    private ProductWithCategoryDTO products;
}
