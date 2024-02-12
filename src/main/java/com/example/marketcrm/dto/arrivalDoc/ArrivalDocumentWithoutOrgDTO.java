package com.example.marketcrm.dto.arrivalDoc;


import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemWithProductsDTO;
import com.example.marketcrm.entity.Organization;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocumentWithoutOrgDTO {
    private Long id;
    private Date doc_date;
    private String  doc_number;
    private Set<ArrivalDocItemWithProductsDTO> items;
}
