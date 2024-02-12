package com.example.marketcrm.dto.organization;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationCreateDTO {
    private String organization_name;
    private String address;
    private String tellNum;
    private String description;
}
