package com.example.marketcrm.dto.organization;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentWithoutOrgDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDTO {
    private Long id;
    private String organization_name;
    private String address;
    private String tellNum;
    private String description;
    private Set<ArrivalDocumentWithoutOrgDTO> documents;
}
