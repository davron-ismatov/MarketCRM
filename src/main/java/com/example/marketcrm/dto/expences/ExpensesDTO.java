package com.example.marketcrm.dto.expences;

import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.dto.organization.OrganizationDTOWithoutDocs;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExpensesDTO {
    private OrganizationDTOWithoutDocs organization;
    private Double amount;
    private Date date;
}
