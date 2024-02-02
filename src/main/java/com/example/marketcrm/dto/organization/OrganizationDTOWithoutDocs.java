package com.example.marketcrm.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDTOWithoutDocs {
    private Long id;
    private String organization_name;
    private String address;
    private String tellNum;
    private String description;
}
