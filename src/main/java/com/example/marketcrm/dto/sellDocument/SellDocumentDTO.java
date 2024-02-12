package com.example.marketcrm.dto.sellDocument;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsWithoutDocsDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellDocumentDTO {
    private Long id;
    private String doc_number;
    private LocalDate date;
    private Set<SellDocumentItemsWithoutDocsDTO> items;
}
