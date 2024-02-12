package com.example.marketcrm.dto.returnToWarehouseDoc;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsWithoutDocsDTO;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnToWarehouseDocDTO {
    private Long id;
    private String doc_number;
    private Date date;
    private Set<ReturnToWarehouseDocItemsWithoutDocsDTO> items;
}
