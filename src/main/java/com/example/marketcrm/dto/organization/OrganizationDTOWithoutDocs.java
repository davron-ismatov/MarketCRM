package com.example.marketcrm.dto.organization;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDTOWithoutDocs {
    private Long id;
    private String name;
    private String address;
    private String tellNum;
    private String description;
}
