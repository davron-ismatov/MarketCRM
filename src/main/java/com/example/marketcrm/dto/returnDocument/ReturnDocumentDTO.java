package com.example.marketcrm.dto.returnDocument;


import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsWithoutDocsDTO;
import com.example.marketcrm.entity.DocStatus;
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
public class ReturnDocumentDTO {
    private Long id;
    private String doc_number;
    private Date date;
    private Set<ReturnDocItemsWithoutDocsDTO> items;
    private DocStatus status;

}
