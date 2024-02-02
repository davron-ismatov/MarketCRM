package com.example.marketcrm.dto.arrivalDoc;

import com.example.marketcrm.dto.organization.OrganizationDTOWithoutDocs;
import com.example.marketcrm.entity.Organization;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalDocumentCreateDTO {
    private Long id;
    private OrganizationDTOWithoutDocs organization;
    private Integer doc_number;
}
