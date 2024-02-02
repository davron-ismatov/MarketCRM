package com.example.marketcrm.dto.arrivalDoc;


import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemWithProductsDTO;
import com.example.marketcrm.entity.Organization;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocumentWithoutOrgDTO {
    private Long id;
    private Date doc_date;
    private Integer doc_number;
    private Set<ArrivalDocItemWithProductsDTO> items;
}
