package com.example.marketcrm.dto.arrivalDoc;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemWithProductsDTO;
import com.example.marketcrm.dto.organization.OrganizationDTOWithoutDocs;
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
public class ArrivalDocDTO {
    private Long id;
    private OrganizationDTOWithoutDocs organization;
    private Date doc_date;
    private String  doc_number;
    private Set<ArrivalDocItemWithProductsDTO> items;
}
