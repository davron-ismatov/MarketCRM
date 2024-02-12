package com.example.marketcrm.dto.arrivalDoc;

import com.example.marketcrm.dto.organization.OrganizationDTOWithoutDocs;
import com.example.marketcrm.entity.Organization;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.sql.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocumentCreateDTO {
    private Long id;
    private OrganizationDTOWithoutDocs organization;
}
