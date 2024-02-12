package com.example.marketcrm.dto.returnToWarehouseDoc;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnToWarehouseDocWithoutItemsDTO {
    private Long id;
    private String doc_number;
    private Date date;
}
