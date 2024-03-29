package com.example.marketcrm.dto.arrivalDoc;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemWithProductsDTO;
import com.example.marketcrm.dto.organization.OrganizationDTOWithoutDocs;
import com.example.marketcrm.entity.DocStatus;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocDTO {
    private Long id;
    private OrganizationDTOWithoutDocs organization;
    private Date doc_date;
    private String  doc_number;
    private Set<ArrivalDocItemWithProductsDTO> items;
    private DocStatus status;
}
